package entities;

import entities.characterClasses.CharacterClass;
import entities.races.Race;

public class Player extends AbstractEntity {
    public CharacterClass aClass;

    public Player(Race race, CharacterClass aClass) {
        super(race);
        this.aClass = aClass;

    }

}
