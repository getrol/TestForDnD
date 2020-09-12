package entities;

import entities.characterClasses.CharacterClass;
import entities.races.Race;
import gameExceptions.IllegalTargetException;
import gameplay.mechanics.Ability;

import java.io.Serializable;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class Player extends AbstractEntity implements Serializable {
    public CharacterClass aClass; //First character class
    public Map<Ability, Integer> stats = new HashMap<>();

    public Player(Race race, CharacterClass aClass) {
        super(race);
        this.aClass = aClass;
        for (Ability a : Ability.values()) {
            if (a.equals(Ability.STEP)) {
                stats.put(a, 6);
            } else if (a.equals(Ability.CHARISMA)) {
                stats.put(a, 0);
            } else {
                stats.put(a, 4);
            }
        }

    }

    @Override
    public void attack(AbstractEntity enemy) throws IllegalTargetException {
        if (enemy.getClass() != this.getClass()) {
            System.out.println(enemy.getClass().getSimpleName() + " was attacked by " + this.getClass().getSimpleName());
        } else {
            throw new IllegalTargetException("You couldn't attack this target");
        }
    }

    @Override
    public void defend() {

    }
}
