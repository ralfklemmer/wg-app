package de.dhbw.wgapp.aufgabenplan.infrastructure;

import de.dhbw.wgapp.aufgabenplan.core.api.infrastructure.TaskRepository;
import de.dhbw.wgapp.aufgabenplan.core.model.Task;
import de.dhbw.wgapp.aufgabenplan.infrastructure.db.DBClient;
import de.dhbw.wgapp.aufgabenplan.infrastructure.entity.BenutzerEntity;
import de.dhbw.wgapp.aufgabenplan.infrastructure.entity.TaskEntity;
import org.springframework.stereotype.Service;

@Service
public class TaskAdapter implements TaskRepository {
    private DBClient db;
    private BenutzerSystemClientApi benutzerSystem;

    public TaskAdapter(DBClient db, BenutzerSystemClientApi benutzerSystem) {
        this.db = db;
        this.benutzerSystem = benutzerSystem;
    }

    @Override
    public String findAll() {
        return db.findAll();
    }

    @Override
    public void save(Task task) {
        BenutzerEntity benutzer = benutzerSystem.findByName(task.bearbeiter);

        TaskEntity entity = new TaskEntity();
        entity.titel = task.titel;
        entity.dueDay = task.dueDay;
        entity.benutzer = benutzer;

        db.save(entity);
    }
}
