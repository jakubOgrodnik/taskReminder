package pl.kuba.taskapp.taskapp.service;

import pl.kuba.taskapp.taskapp.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    List<Task> getAllTasksByUserId(Long userId);
    Optional<Task> getSingleTaskById(Long taskId);
    void deleteTask(Long taskId);
    Task addTask(Task task);
}
