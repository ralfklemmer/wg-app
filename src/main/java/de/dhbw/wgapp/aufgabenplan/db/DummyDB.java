package de.dhbw.wgapp.aufgabenplan.db;

import de.dhbw.wgapp.aufgabenplan.presentation.TaskDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DummyDB {
    private List<TaskDto> tasks = new ArrayList<>();

    public DummyDB() {
        TaskDto init = new TaskDto();
        init.titel = "der ERSTE";
        init.bearbeiter = "Ralf";
        init.dueDay = LocalDate.of(2022, 03, 05);
        tasks.add(init);
    }

    public void save(TaskDto task) {
        tasks.add(task);

        System.out.println(tasks);
    }

    public String findAll() {
        return tasks.toString();
    }
}
