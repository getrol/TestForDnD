package entities;

import entities.AbstractEntity;
import entities.races.Race;

public abstract class Monster extends AbstractEntity {

    public Monster(Race race) {
        super(race);
    }

}
