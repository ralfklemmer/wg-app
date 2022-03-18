package de.dhbw.wgapp.aufgabenplan.core;

import de.dhbw.wgapp.aufgabenplan.infrastructure.TaskRepository;
import de.dhbw.wgapp.aufgabenplan.presentation.TaskDto;
import org.springframework.stereotype.Service;

@Service
public class TaskService implements TaskServiceInterface {

    private TaskRepository taskRepository;

    public TaskService(TaskRepository dao) {
        this.taskRepository = dao;
    }

    public void createTask(TaskDto taskDto) {
        // gibt es den Bewohner

        // ist sein Saldo positiv?

        taskRepository.save(taskDto);
    }

    @Override
    public String findAll() {
        return taskRepository.findAll();
    }


}
