package strategy;

public abstract class Animal {
    protected Flyable flyable;
    abstract void makeSound();
    abstract String getName();
    abstract Double getWeight();
    public void fly(){
        flyable.fly();
    }
}


