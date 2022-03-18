package de.dhbw.wgapp.aufgabenplan.presentation;

import de.dhbw.wgapp.aufgabenplan.core.TaskServiceInterface;
import de.dhbw.wgapp.aufgabenplan.core.model.Task;
import org.springframework.http.MediaType;
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

    @PostMapping(value = "/tasks", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createTask(@RequestBody TaskDto taskDto) {
        // Viel logik

        TaskMapper mapper = new TaskMapper();
        Task task = mapper.map(taskDto);
        taskService.createTask(task);


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
