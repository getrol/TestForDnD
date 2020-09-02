import entities.HopGoblin;
import entities.Monster;
import entities.Player;
import entities.characterClasses.Bard;
import entities.races.Goblin;
import entities.races.Human;
import gameExceptions.IllegalTargetException;

public class Test {
    public static void main(String[] args) {
        Player Getrol = new Player(new Human(), new Bard());
        Player Liza = new Player(new Human(), new Bard());
        Monster Zanuda = new HopGoblin(new Goblin());

        try {
            Getrol.attack(Zanuda);
            Liza.attack(Zanuda);
            Liza.attack(Getrol);
        } catch (IllegalTargetException e) {
            System.out.println(e.getMessage());
        }

    }
}
