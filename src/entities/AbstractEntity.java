package entities;

import entities.races.Race;
import gameExceptions.IllegalTargetException;
import gameplay.mechanics.Ability;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractEntity {
    Race race;
    Map<Ability, Integer> abilityPoints = new HashMap<>();

    public AbstractEntity(Race race) {
        for (Ability ability : Ability.values()){ //Filling ability points, default: 10, Note: !order is not same as in ENUM! but alphabet
            abilityPoints.put(ability, 10);
        }
        this.race = race;
    }

    public abstract void attack(AbstractEntity enemy) throws IllegalTargetException;

    public abstract void defend();
}
