package factory;


import factory.factories.PizzaFactory;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory=new PizzaFactory();
        PizzaStore pizzaStore=new PizzaStore(pizzaFactory);
        Scanner sc=new Scanner(System.in);
        String type="";
        System.out.println("Enter pizza name: ");
        System.out.println("chickentikka");
        System.out.println("chickensupreme");
        System.out.println("malaiboti");

        if(sc.hasNextLine()){
            type=sc.nextLine();
            pizzaStore.orderPizza(type);
        }

    }

}

