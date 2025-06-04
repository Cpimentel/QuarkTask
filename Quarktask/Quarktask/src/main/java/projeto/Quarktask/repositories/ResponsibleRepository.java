package projeto.Quarktask.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.Quarktask.domain.responsibities.Responsible;

public interface ResponsibleRepository extends JpaRepository<Responsible, Long> {
}
