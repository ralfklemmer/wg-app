package de.dhbw.wgapp.aufgabenplan.presentation;

import de.dhbw.wgapp.aufgabenplan.core.TaskServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    private final TaskServiceInterface taskService;

    public TaskController(TaskServiceInterface taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/tasks")
    public void createTask(@RequestBody TaskDto taskDto) {
        // Viel logik

        taskService.createTask(taskDto);


        // noch mehr logik
        // noch mehr logik
        // noch mehr logik
        // noch mehr logik
        // noch mehr logik
        // noch mehr logik
    }

    @GetMapping("/tasks")
    public String getAllTasks() {
        return taskService.findAll();
    }
}
