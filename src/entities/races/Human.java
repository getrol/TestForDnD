package entities.races;

public class Human implements Race {
    @Override
    public void getRaceBonus() {
        System.out.println("Humans bonus");
    }
}
