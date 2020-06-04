package strategy;

public class Driver {
    public static void main(String[] args) {
        Animal dog=new Dog();
        Animal sparrow=new Sparrow();
        System.out.println("running dog features");
        System.out.println("dog making sound");
        dog.makeSound();
        System.out.println("name of dog");
        System.out.println(dog.getName());
        System.out.println("weight of dog");
        System.out.println(dog.getWeight());
        System.out.println("flying ability of dog");
        dog.fly();
        System.out.println("running sparrow features");
        System.out.println("sparrow making sound");
        sparrow.makeSound();
        System.out.println("name of sparrow");
        System.out.println(sparrow.getName());
        System.out.println("weight of sparrow");
        System.out.println(sparrow.getWeight());
        System.out.println("flying ability of sparrow");
        sparrow.fly();
    }
}
