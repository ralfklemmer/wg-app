package de.dhbw.wgapp.aufgabenplan.db;

public class BenutzerEntity {
    private long id;
    private String  name;

    public BenutzerEntity(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
