package rt.digital.recruitmentservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rt.digital.recruitmentservice.domain.User;
import rt.digital.recruitmentservice.domain.UserRole;
import rt.digital.recruitmentservice.repository.UserRepository;

import java.util.List;

@RestController
public class ProviderRestController {

    @Autowired
    private final UserRepository userRepository;

    public ProviderRestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/lk_providers")
    @PreAuthorize("hasAnyAuthority('admin:read', 'user:read')")
    List<User> findAllProviders() {
        return userRepository.findByRole(UserRole.PROVIDER.name());
    }
}
