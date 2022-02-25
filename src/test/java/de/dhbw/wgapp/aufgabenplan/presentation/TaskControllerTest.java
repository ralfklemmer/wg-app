package de.dhbw.wgapp.aufgabenplan.presentation;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TaskControllerTest {
    @Test
    void name() {
        TaskController controller = new TaskController();
        TaskDto taskDto = new TaskDto();
        taskDto.bearbeiter = "LuKas";
        taskDto.dueDay = LocalDate.now();
        taskDto.titel = "Apfel kaufen";
        controller.createTask(taskDto);
    }
}