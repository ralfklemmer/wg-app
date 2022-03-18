package de.dhbw.wgapp.aufgabenplan.core;

import de.dhbw.wgapp.aufgabenplan.core.model.Task;

public interface TaskServiceInterface {
    void createTask(Task task);

    String findAll();

}
