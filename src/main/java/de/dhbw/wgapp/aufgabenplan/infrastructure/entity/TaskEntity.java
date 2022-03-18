package de.dhbw.wgapp.aufgabenplan.infrastructure.entity;

import java.time.LocalDate;

public class TaskEntity {
    public String titel;
    public BenutzerEntity benutzer;
    // Ausführungsdatum
    public LocalDate dueDay;
}
