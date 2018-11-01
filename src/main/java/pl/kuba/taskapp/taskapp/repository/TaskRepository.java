package pl.kuba.taskapp.taskapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kuba.taskapp.taskapp.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
