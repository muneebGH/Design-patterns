package factory.factories;

import factory.pizzas.ChickenSupremePizza;
import factory.pizzas.ChickenTikkaPizza;
import factory.pizzas.MalaiBotiPizza;
import factory.pizzas.Pizza;

public class PizzaFactory {

    public Pizza createPizza(String type){
        type=type.toLowerCase().trim();
        Pizza pizza=null;

        if(type.equals("chickentikka")){
            pizza=new ChickenTikkaPizza();
        }else if(type.equals("chickensupreme")){
            pizza=new ChickenSupremePizza();
        }else if(type.equals("malaiboti")){
            pizza=new MalaiBotiPizza();
        }

        return pizza;
    }
}
