package de.dhbw.wgapp.aufgabenplan.dataaccess;

import de.dhbw.wgapp.aufgabenplan.db.DummyDB;
import de.dhbw.wgapp.aufgabenplan.presentation.TaskDto;
import org.springframework.stereotype.Service;

@Service
public class ExternalSystemClient implements ExternalSystemClientInterface {
    DummyDB db = new DummyDB();

    @Override
    public void save(TaskDto task) {
        db.save(task);
    }

    @Override
    public String findAll() {
        return db.findAll();
    }
}
