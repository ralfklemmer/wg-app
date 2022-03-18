package de.dhbw.wgapp.aufgabenplan.infrastructure;

import de.dhbw.wgapp.aufgabenplan.presentation.TaskDto;

public interface TaskRepository {
    String findAll();
    void save(TaskDto task);

}
