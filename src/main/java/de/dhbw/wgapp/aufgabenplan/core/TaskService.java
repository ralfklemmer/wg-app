package de.dhbw.wgapp.aufgabenplan.core;

import de.dhbw.wgapp.aufgabenplan.dataaccess.ExternalSystemClientInterface;
import de.dhbw.wgapp.aufgabenplan.presentation.TaskDto;
import org.springframework.stereotype.Service;

@Service
public class TaskService implements TaskServiceInterface {

    private ExternalSystemClientInterface externalSystemClient;

    public TaskService(ExternalSystemClientInterface dao) {
        this.externalSystemClient = dao;
    }

    public void createTask(TaskDto taskDto) {
        // gibt es den Bewohner

        // ist sein Saldo positiv?

        externalSystemClient.save(taskDto);
    }

    @Override
    public String findAll() {
        return externalSystemClient.findAll();
    }


}
