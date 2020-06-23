package decorator.pizzas;

public class ChickenSupremePizza implements Pizza{
    @Override
    public String getDescription() {
        return "chicken supreme pizza";
    }

    @Override
    public double getCost() {
        return 14;
    }
}
