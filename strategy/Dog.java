package strategy;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("bark");
    }

    @Override
    public String getName() {
        return "doggy";
    }

    @Override
    public Double getWeight() {
        return 5.0;
    }

    public Dog() {
        flyable=new CannotFly();
    }
}
