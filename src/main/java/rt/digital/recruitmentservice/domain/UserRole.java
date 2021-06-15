package rt.digital.recruitmentservice.domain;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

public enum UserRole {

    MANAGER(Set.of(UserPermission.ADMIN_READ, UserPermission.ADMIN_WRITE)),
    PROVIDER(Set.of(UserPermission.USER_READ, UserPermission.USER_WRITE)),
    CUSTOMER(Set.of(UserPermission.USER_READ)),
    EMPLOYEE(Set.of(UserPermission.USER_READ));

    private final Set<UserPermission> userPermissions;

    UserRole(Set<UserPermission> userPermissions) {
        this.userPermissions = userPermissions;
    }

    public Set<UserPermission> getPermissions() {
        return userPermissions;
    }

    public Set<SimpleGrantedAuthority> grantedAuthorities() {
        return getPermissions().stream()
                .map(userPermission -> new SimpleGrantedAuthority(userPermission.getPermission()))
                .collect(Collectors.toSet());
    }
}
