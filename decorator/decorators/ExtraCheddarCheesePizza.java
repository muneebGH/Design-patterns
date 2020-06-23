package decorator.decorators;

import decorator.pizzas.Pizza;

public class ExtraCheddarCheesePizza extends PizzaToppingDecorator {
    public ExtraCheddarCheesePizza(Pizza wrappedPizza) {
        super(wrappedPizza);
    }
    public String getDescription(){
        return wrappedPizza.getDescription()+",extra chedder cheese";
    }

    public double getCost(){
        return wrappedPizza.getCost()+5;
    }
}

