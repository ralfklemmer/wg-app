package de.dhbw.wgapp.aufgabenplan.presentation;

import de.dhbw.wgapp.aufgabenplan.core.model.Task;

public class TaskMapper {
    public Task map(TaskDto dto) {
        Task task = new Task();
        task.bearbeiter = dto.bearbeiter;
        task.titel = dto.titel;
        task.dueDay = dto.dueDay;

        return task;
    }
}
