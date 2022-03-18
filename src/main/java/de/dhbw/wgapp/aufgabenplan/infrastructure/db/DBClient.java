package de.dhbw.wgapp.aufgabenplan.infrastructure.db;

import de.dhbw.wgapp.aufgabenplan.infrastructure.entity.BenutzerEntity;
import de.dhbw.wgapp.aufgabenplan.infrastructure.entity.TaskEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DBClient {
    private List<TaskEntity> tasks = new ArrayList<>();

    public DBClient() {
        TaskEntity init = new TaskEntity();
        init.titel = "der ERSTE";
        init.benutzer = new BenutzerEntity(10L, "Ralf");
        init.dueDay = LocalDate.of(2022, 03, 05);
        tasks.add(init);
    }

    public void save(TaskEntity task) {
        tasks.add(task);

        System.out.println(tasks);
    }

    public String findAll() {
        return tasks.toString();
    }
}
