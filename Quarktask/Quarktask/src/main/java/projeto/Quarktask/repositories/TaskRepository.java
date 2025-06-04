package projeto.Quarktask.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.Quarktask.domain.task.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
