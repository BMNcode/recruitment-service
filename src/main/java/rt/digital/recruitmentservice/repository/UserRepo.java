package rt.digital.recruitmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rt.digital.recruitmentservice.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
