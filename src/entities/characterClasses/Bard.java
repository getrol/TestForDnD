package entities.characterClasses;

import java.io.Serializable;

public class Bard implements CharacterClass, Serializable {
    @Override
    public void getClassBonus() {
        System.out.println("Bard bonuses");
    }
}
