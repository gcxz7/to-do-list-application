package br.com.to_do_list_application.domain.repository;

import br.com.to_do_list_application.domain.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
