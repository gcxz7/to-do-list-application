package br.com.to_do_list_application.service;

import br.com.to_do_list_application.domain.model.Task;
import br.com.to_do_list_application.domain.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task){};
    public Task editTask(Task task){};
    public Task completeTask(Long id){};
    public boolean deleteTask(Long id){};
    public List<Task> listTask(){};
    public Task findByTitle(String title){};
    public List<Task> findByDate(LocalDate date){};
    public List<Task> findByStatus(Boolean completed){};
}
