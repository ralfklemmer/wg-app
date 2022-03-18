package de.dhbw.wgapp.aufgabenplan.db;

import de.dhbw.wgapp.aufgabenplan.core.model.Task;
import de.dhbw.wgapp.aufgabenplan.presentation.TaskDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DummyDB {
    private List<Task> tasks = new ArrayList<>();

    public DummyDB() {
        Task init = new Task();
        init.titel = "der ERSTE";
        init.bearbeiter = "Ralf";
        init.dueDay = LocalDate.of(2022, 03, 05);
        tasks.add(init);
    }

    public void save(Task task) {
        tasks.add(task);

        System.out.println(tasks);
    }

    public String findAll() {
        return tasks.toString();
    }
}
