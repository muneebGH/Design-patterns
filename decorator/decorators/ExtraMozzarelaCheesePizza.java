package decorator.decorators;

import decorator.pizzas.Pizza;

public class ExtraMozzarelaCheesePizza extends PizzaToppingDecorator {
    public ExtraMozzarelaCheesePizza(Pizza wrappedPizza) {
        super(wrappedPizza);
    }
    public String getDescription(){
        return wrappedPizza.getDescription()+",extra mozarella cheese";
    }

    public double getCost(){
        return wrappedPizza.getCost()+6;
    }
}
