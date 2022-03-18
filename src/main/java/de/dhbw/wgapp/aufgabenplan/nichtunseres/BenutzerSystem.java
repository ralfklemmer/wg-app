package de.dhbw.wgapp.aufgabenplan.nichtunseres;

import de.dhbw.wgapp.aufgabenplan.db.BenutzerEntity;

import java.util.ArrayList;
import java.util.List;

public class BenutzerSystem {
    public static final String HANS = "Hans";
    public static final String PETER = "Peter";
    public static final String GUIDO = "Guido";
    public static final String LIA = "Lia";
    public static final String PHIBIE = "Phibie";
    public static final String IZZY = "Izzy";
    private List<BenutzerEntity> benutzer = new ArrayList<>();

    public BenutzerSystem() {
        benutzer.add(new BenutzerEntity(1L, HANS));
        benutzer.add(new BenutzerEntity(2L, PETER));
        benutzer.add(new BenutzerEntity(3L, GUIDO));
        benutzer.add(new BenutzerEntity(4L, LIA));
        benutzer.add(new BenutzerEntity(5L, PHIBIE));
        benutzer.add(new BenutzerEntity(6L, IZZY));

    }

    public BenutzerEntity findByName(String name) {
        return benutzer.stream().filter(b -> name.equals(b.getName())).findAny().orElseThrow(() -> new IllegalArgumentException());
    }
}
