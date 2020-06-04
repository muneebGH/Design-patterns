package strategy;

public class CannotFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("no! this animal cannot fly");
    }
}

