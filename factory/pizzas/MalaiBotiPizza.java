package factory.pizzas;

public class MalaiBotiPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing MalaiBoti pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking MalaiBoti pizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting MalaiBoti pizza");
    }

    @Override
    public void pack() {
        System.out.println("packing MalaiBoti pizza");
    }
}
