package rt.digital.recruitmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rt.digital.recruitmentservice.domain.User;
import rt.digital.recruitmentservice.domain.UserRole;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByRole(String role);
    Optional<User> findByEmail(String email);
}
