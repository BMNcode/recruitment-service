package rt.digital.recruitmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rt.digital.recruitmentservice.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
