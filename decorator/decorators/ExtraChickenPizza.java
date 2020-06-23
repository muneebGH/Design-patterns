package decorator.decorators;

import decorator.pizzas.Pizza;

public class ExtraChickenPizza extends PizzaToppingDecorator{
    public ExtraChickenPizza(Pizza wrappedPizza) {
        super(wrappedPizza);
    }
    public String getDescription(){
        return wrappedPizza.getDescription()+",extra chicken";
    }
    public double getCost(){
        return wrappedPizza.getCost()+8;
    }
}
