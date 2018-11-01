package pl.kuba.taskapp.taskapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.kuba.taskapp.taskapp.model.Task;
import pl.kuba.taskapp.taskapp.repository.TaskRepository;

import java.util.List;

@Controller
public class TaskController {

    private TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/allTasks")
    @ResponseBody
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    @PostMapping("/addTask")
    public Task addTask(Task task) {
        return taskRepository.save(task);
    }
    @PutMapping("/update")
    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }
    @DeleteMapping("/delete")
    public void deleteTask(Task task) {
        taskRepository.delete(task);
    }
}
