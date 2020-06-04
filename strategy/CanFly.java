package strategy;

public class CanFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("animal is flying");
    }
}
