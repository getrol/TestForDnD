import entities.Player;
import entities.characterClasses.Bard;
import entities.races.Human;

public class Test {
    public static void main(String[] args) {
        Player player = new Player(new Human(), new Bard());
        player.aClass.getClassBonus();
    }
}
