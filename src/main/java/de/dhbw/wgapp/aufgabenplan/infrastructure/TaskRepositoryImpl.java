package de.dhbw.wgapp.aufgabenplan.infrastructure;

import de.dhbw.wgapp.aufgabenplan.db.DummyDB;
import de.dhbw.wgapp.aufgabenplan.presentation.TaskDto;
import org.springframework.stereotype.Service;

@Service
public class TaskRepositoryImpl implements TaskRepository {
    private DummyDB db = new DummyDB();

    @Override
    public String findAll() {
        return db.findAll();
    }

    @Override
    public void save(TaskDto task) {

        //TODO finde den Benutzer, setze ihn im Task.
        db.save(task);
    }
}
