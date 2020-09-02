package entities;

import entities.characterClasses.CharacterClass;
import entities.races.Race;
import gameExceptions.IllegalTargetException;

public class Player extends AbstractEntity {
    public CharacterClass aClass; //First character class

    public Player(Race race, CharacterClass aClass) {
        super(race);
        this.aClass = aClass;

    }

    @Override
    public void attack(AbstractEntity enemy) throws IllegalTargetException {
        if (enemy.getClass() != this.getClass()){
            System.out.println(enemy.getClass().getSimpleName() + " was attacked by " + this.getClass().getSimpleName());
        } else {
            throw new IllegalTargetException("You couldn't attack this target");
        }
    }

    @Override
    public void defend() {

    }
}
