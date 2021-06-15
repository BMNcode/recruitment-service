package rt.digital.recruitmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rt.digital.recruitmentservice.domain.Provider;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
}
