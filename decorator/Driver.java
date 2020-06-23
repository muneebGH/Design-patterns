package decorator;

import decorator.decorators.ExtraCheddarCheesePizza;
import decorator.decorators.ExtraChickenPizza;
import decorator.decorators.ExtraMozzarelaCheesePizza;
import decorator.pizzas.ChickenSupremePizza;
import decorator.pizzas.ChickenTikkaPizza;
import decorator.pizzas.Pizza;
import decorator.pizzas.PlainPizza;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean repeat=true;
        Pizza pizza=new PlainPizza();
        while (repeat) {
            System.out.println("Which pizza you want ?");
            System.out.println("1 : plain pizza");
            System.out.println("2 : chicken tikka pizza");
            System.out.println("3 : chicken supreme pizza");


            int choice = sc.nextInt();

            if (choice == 1) {
                pizza = new PlainPizza();
                repeat=false;
            } else if (choice == 2) {
                pizza = new ChickenTikkaPizza();
                repeat=false;
            } else if (choice == 3) {
                pizza = new ChickenSupremePizza();
                repeat=false;
            } else {
                System.out.println("wrong input : try again");
                repeat=true;
            }
        }
        repeat=true;
        while (repeat){
            System.out.println("choose topping ");
            System.out.println("1 : extra cheddar cheese");
            System.out.println("2 : extra mozarella cheese");
            System.out.println("3 : extra chicken");
            System.out.println("4 : none");

            int choice=sc.nextInt();
            if(choice==1){
                pizza=new ExtraCheddarCheesePizza(pizza);
                repeat=false;
            }else if(choice==2){
                pizza=new ExtraMozzarelaCheesePizza(pizza);
                repeat=false;
            }else if(choice==3){
                pizza=new ExtraChickenPizza(pizza);
                repeat=false;
            }else if(choice==4){
                repeat=false;
            }
            else{
                System.out.println("wrong input : try again");
                repeat=true;
            }
        }
        System.out.println("printing pizza");
        System.out.println(pizza.getDescription());
        System.out.println("printing cost");
        System.out.println(pizza.getCost());

    }
}
