package factory.pizzas;

public class ChickenTikkaPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing ChickenTikka pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking ChickenTikka pizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting ChickenTikka pizza");
    }

    @Override
    public void pack() {
        System.out.println("packing ChickenTikka pizza");
    }
}
