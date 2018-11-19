package pl.kuba.taskapp.taskapp.service;

import org.springframework.stereotype.Service;
import pl.kuba.taskapp.taskapp.model.Task;
import pl.kuba.taskapp.taskapp.repository.TaskRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> getAllTasksByUserId(Long userId) {
        return taskRepository.findAll();
    }

    @Override
    public Optional<Task> getSingleTaskById(Long taskId) {
        return taskRepository.findById(taskId);
    }

    @Override
    public void deleteTask(Long taskId) {
        taskRepository.deleteById(taskId);
    }

    @Override
    public Task addTask(Task task) {
        return taskRepository.save(task);
    }
}
