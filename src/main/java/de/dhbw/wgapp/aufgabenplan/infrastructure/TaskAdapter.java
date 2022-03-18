package de.dhbw.wgapp.aufgabenplan.infrastructure;

import de.dhbw.wgapp.aufgabenplan.core.api.infrastructure.TaskRepository;
import de.dhbw.wgapp.aufgabenplan.core.model.Task;
import de.dhbw.wgapp.aufgabenplan.db.DummyDB;
import org.springframework.stereotype.Service;

@Service
public class TaskAdapter implements TaskRepository {
    private DummyDB db = new DummyDB();

    @Override
    public String findAll() {
        return db.findAll();
    }

    @Override
    public void save(Task task) {

        //TODO finde den Benutzer, setze ihn im Task.
        db.save(task);
    }
}
