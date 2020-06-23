package decorator.decorators;

import decorator.pizzas.Pizza;

abstract public class PizzaToppingDecorator implements Pizza {
    protected Pizza wrappedPizza;

    public PizzaToppingDecorator(Pizza wrappedPizza) {
        this.wrappedPizza = wrappedPizza;
    }

    @Override
    public String getDescription() {
        return wrappedPizza.getDescription();
    }

    @Override
    public double getCost() {
        return wrappedPizza.getCost();
    }
}
