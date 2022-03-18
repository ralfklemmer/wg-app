package de.dhbw.wgapp.aufgabenplan.infrastructure;

import de.dhbw.wgapp.aufgabenplan.db.BenutzerEntity;
import de.dhbw.wgapp.aufgabenplan.nichtunseres.BenutzerSystem;
import org.springframework.stereotype.Service;

@Service
public class BenutzerSystemClient implements BenutzerSystemClientApi {
    BenutzerSystem system = new BenutzerSystem();

    @Override
    public BenutzerEntity findByName(String name) {
        return system.findByName(name);
    }
}
