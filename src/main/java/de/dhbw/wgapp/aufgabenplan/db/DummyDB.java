package de.dhbw.wgapp.aufgabenplan.db;

import de.dhbw.wgapp.aufgabenplan.presentation.TaskDto;
import org.springframework.scheduling.config.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DummyDB {
    private List<TaskDto> tasks = new ArrayList<>();

    public DummyDB() {
    }

    public void save(TaskDto task) {
        tasks.add(task);

        System.out.println(tasks);
    }

}
