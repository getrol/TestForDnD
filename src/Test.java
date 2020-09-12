import entities.HopGoblin;
import entities.Monster;
import entities.Player;
import entities.characterClasses.Bard;
import entities.races.Goblin;
import entities.races.Human;
import gameExceptions.IllegalTargetException;
import gameplay.mechanics.Ability;

import java.io.*;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Player Getrol1 = new Player(new Human(), new Bard());
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("GetrolStats.txt"));
            objectOutputStream.writeObject(Getrol1);
            objectOutputStream.close();
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("GetrolStats.txt"));
            Player Getrol = (Player) objectInputStream.readObject();

            for (Map.Entry<Ability, Integer> a : Getrol.stats.entrySet()) {
                System.out.println(a.getKey() + " имеет значение: " + a.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
