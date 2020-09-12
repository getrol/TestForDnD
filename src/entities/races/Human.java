package entities.races;

import java.io.Serializable;

public class Human implements Race, Serializable {
    @Override
    public void getRaceBonus() {
        System.out.println("Humans bonus");
    }
}
