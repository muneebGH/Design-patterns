package factory;

import factory.factories.PizzaFactory;
import factory.pizzas.Pizza;

public class PizzaStore {

    PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza=factory.createPizza(type);
        pizza.prepare();
        pizza.bake();;
        pizza.cut();
        pizza.pack();
        return pizza;
    }
}
