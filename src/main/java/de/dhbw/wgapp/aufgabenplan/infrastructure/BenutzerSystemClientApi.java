package de.dhbw.wgapp.aufgabenplan.infrastructure;

import de.dhbw.wgapp.aufgabenplan.db.BenutzerEntity;

public interface BenutzerSystemClientApi {
    BenutzerEntity findByName(String name);
}
