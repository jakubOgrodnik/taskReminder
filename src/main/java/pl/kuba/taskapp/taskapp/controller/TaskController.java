package pl.kuba.taskapp.taskapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.kuba.taskapp.taskapp.model.Task;
import pl.kuba.taskapp.taskapp.service.TaskService;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/{userId}/allTasks")
    @ResponseBody
    public List<Task> getAllTasks(@PathVariable("userId") Long userId) {
        return taskService.getAllTasksByUserId(userId);
    }
    @GetMapping("/{taskId}")
    @ResponseBody
    public Optional<Task> getSingleTask(@PathVariable("taskId") Long taskId) {
        return taskService.getSingleTaskById(taskId);
    }

    @PostMapping("/addTask")
    public Task addTask(Task task) {
        return taskService.addTask(task);
    }
    @PutMapping("/update")
    public Task updateTask(Task task) {
        return taskService.addTask(task);
    }
    @DeleteMapping("/delete/{taskId}")
    public void deleteTask(@PathVariable("taskId") Long taskId) {
        taskService.deleteTask(taskId);
    }

}
