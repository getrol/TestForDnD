package entities;

import entities.races.Race;
import gameExceptions.IllegalTargetException;

public class HopGoblin extends Monster{

    public HopGoblin(Race race) {
        super(race);
    }

    @Override
    public void attack(AbstractEntity enemy) throws IllegalTargetException {
        throw new IllegalTargetException("");
    }

    @Override
    public void defend() {

    }
}
