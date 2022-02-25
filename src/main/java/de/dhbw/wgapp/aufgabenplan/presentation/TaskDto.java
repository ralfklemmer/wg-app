package de.dhbw.wgapp.aufgabenplan.presentation;

import java.time.LocalDate;

public class TaskDto {
    public String titel;
    public String bearbeiter;
    // Ausführungsdatum
    public LocalDate dueDay;

    @Override
    public String toString() {
        return "TaskDto{" +
                "titel='" + titel + '\'' +
                ", bearbeiter='" + bearbeiter + '\'' +
                ", dueDay=" + dueDay +
                '}';
    }
}
