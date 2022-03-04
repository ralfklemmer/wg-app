package de.dhbw.wgapp.aufgabenplan.dataaccess;

import de.dhbw.wgapp.aufgabenplan.presentation.TaskDto;

public interface ExternalSystemClientInterface {
    void save(TaskDto task);

    String findAll();

}
