package de.dhbw.wgapp.aufgabenplan.core;

import de.dhbw.wgapp.aufgabenplan.dataaccess.TaskDataAccessObject;
import de.dhbw.wgapp.aufgabenplan.presentation.TaskDto;

public class TaskService {

    public void createTask(TaskDto taskDto) {
        TaskDataAccessObject dao = new TaskDataAccessObject();
        dao.save(taskDto);
    }
}
