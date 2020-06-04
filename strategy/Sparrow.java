package strategy;

public class Sparrow extends Animal {
    @Override
    void makeSound() {
        System.out.println("chirping");
    }

    @Override
    String getName() {
        return "sparroie";
    }

    @Override
    Double getWeight() {
        return 0.25;
    }

    public Sparrow() {
        flyable=new CanFly();
    }
}


