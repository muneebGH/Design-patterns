package template.sandwichMaker;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        SandwichMaker sandwichMaker=null;
        System.out.println("which type of sandwich do you want");
        System.out.println("press 1 for veggie sandwich");
        System.out.println("press 2 for meat sandwich");
        System.out.println("press 3 for all rounder sandwich");
        int choice=new Scanner(System.in).nextInt();
        if(choice==1){
            sandwichMaker=new VegetableSandwichMaker();
        }else if(choice==2){
            sandwichMaker=new MeatSandwichMaker();
        }else if(choice==3){
            sandwichMaker=new AllRounderSandwichMaker();
        }else{
            System.out.println("try adding better input next time ");
        }
        if(sandwichMaker!=null)sandwichMaker.makeSandwich();

    }
}
