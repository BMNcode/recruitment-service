package rt.digital.recruitmentservice.domain;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

public enum Role {
    MANAGER(Set.of(Permission.ADMIN_WRITE, Permission.ADMIN_READ)),
    PROVIDER(Set.of(Permission.USER_READ, Permission.USER_WRITE)),
    CUSTOMER(Set.of(Permission.USER_READ));

    private final Set<Permission> permissions;

    Role(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> grantedAuthorities() {
        return getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
    }
}
