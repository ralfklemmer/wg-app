package de.dhbw.wgapp.aufgabenplan.core;

import de.dhbw.wgapp.aufgabenplan.core.model.Task;
import de.dhbw.wgapp.aufgabenplan.infrastructure.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService implements TaskServiceInterface {

    private TaskRepository taskRepository;

    public TaskService(TaskRepository dao) {
        this.taskRepository = dao;
    }

    public void createTask(Task task) {
        // gibt es den Bewohner

        // ist sein Saldo positiv?

        taskRepository.save(task);
    }

    @Override
    public String findAll() {
        return taskRepository.findAll();
    }


}
