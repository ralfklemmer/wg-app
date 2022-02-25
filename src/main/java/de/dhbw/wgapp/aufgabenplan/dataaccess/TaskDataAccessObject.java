package de.dhbw.wgapp.aufgabenplan.dataaccess;

import de.dhbw.wgapp.aufgabenplan.db.DummyDB;
import de.dhbw.wgapp.aufgabenplan.presentation.TaskDto;

public class TaskDataAccessObject {
    DummyDB db = new DummyDB();

    public void save(TaskDto task) {
        db.save(task);
    }
}
