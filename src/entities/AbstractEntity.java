package entities;

import entities.races.Race;

public abstract class AbstractEntity {
    Race race;

    public AbstractEntity(Race race) {
        this.race = race;
    }
}
