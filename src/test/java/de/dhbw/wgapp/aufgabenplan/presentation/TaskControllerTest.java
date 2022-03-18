package de.dhbw.wgapp.aufgabenplan.presentation;

import de.dhbw.wgapp.aufgabenplan.core.TaskService;
import de.dhbw.wgapp.aufgabenplan.core.TaskServiceInterface;
import de.dhbw.wgapp.aufgabenplan.core.model.Task;
import de.dhbw.wgapp.aufgabenplan.infrastructure.BenutzerSystemClient;
import de.dhbw.wgapp.aufgabenplan.infrastructure.TaskAdapter;
import de.dhbw.wgapp.aufgabenplan.infrastructure.db.DBClient;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TaskControllerTest {
    @Test
    void createTask() {
        TaskController controller = new TaskController(new TaskService(new TaskAdapter(new DBClient(), new BenutzerSystemClient())));
        TaskDto taskDto = new TaskDto();
        taskDto.bearbeiter = "LuKas";
        taskDto.dueDay = LocalDate.now();
        taskDto.titel = "Apfel kaufen";
        controller.createTask(taskDto);
    }

    @Test
    void createTask_usingTestDouble() {
        TaskServiceInterfaceTestDouble testDouble = new TaskServiceInterfaceTestDouble();

        TaskController controller = new TaskController(testDouble);
        controller.createTask(new TaskDto());

        assertTrue(testDouble.isCalled());
    }

    public class TaskServiceInterfaceTestDouble implements TaskServiceInterface {
        boolean isCalled = false;

        @Override
        public void createTask(Task task) {
            isCalled = true;
        }

        @Override
        public String findAll() {
            return "";
        }

        public boolean isCalled() {
            return isCalled;
        }
    }
}