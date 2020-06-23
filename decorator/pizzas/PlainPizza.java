package decorator.pizzas;

import decorator.pizzas.Pizza;

public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "plain pizza";
    }

    @Override
    public double getCost() {
        return 10;
    }
}

