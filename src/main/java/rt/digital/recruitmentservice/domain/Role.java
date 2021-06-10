package rt.digital.recruitmentservice.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    MANAGER, PROVIDER, CUSTOMER;

    @Override
    public String getAuthority() {
        return name();
    }
}
