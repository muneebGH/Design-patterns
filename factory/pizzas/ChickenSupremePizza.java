package factory.pizzas;

public class ChickenSupremePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("preparing ChickenSupreme pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking ChickenSupreme pizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting ChickenSupreme pizza");
    }

    @Override
    public void pack() {
        System.out.println("packing ChickenSupreme pizza");
    }
}
