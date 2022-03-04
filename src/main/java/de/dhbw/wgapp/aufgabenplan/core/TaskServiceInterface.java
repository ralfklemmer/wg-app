package de.dhbw.wgapp.aufgabenplan.core;

import de.dhbw.wgapp.aufgabenplan.presentation.TaskDto;

public interface TaskServiceInterface {
    void createTask(TaskDto taskDto);

    String findAll();

}
