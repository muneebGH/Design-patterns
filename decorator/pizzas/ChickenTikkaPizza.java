package decorator.pizzas;

public class ChickenTikkaPizza implements Pizza{
    @Override
    public String getDescription() {
        return "chicken thika pizza";
    }

    @Override
    public double getCost() {
        return 12;
    }
}
