package de.dhbw.wgapp.aufgabenplan.core.api.infrastructure;


import de.dhbw.wgapp.aufgabenplan.core.model.Task;

public interface TaskRepository {
    String findAll();
    void save(Task task);
}
