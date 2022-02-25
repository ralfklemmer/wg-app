package de.dhbw.wgapp.aufgabenplan.presentation;

import de.dhbw.wgapp.aufgabenplan.core.TaskService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    public void createTask(TaskDto taskDto) {
        TaskService taskService = new TaskService();
        taskService.createTask(taskDto);
    }
}
