package template.sandwichMaker;

public class AllRounderSandwichMaker extends SandwichMaker {
    @Override
    protected void putButter() {
        System.out.println("adding butter on all rounder sandwich");
    }

    @Override
    protected void putMeat() {
        System.out.println("adding meat on all rounder sandwich");
    }

    @Override
    protected void putVeggies() {
        System.out.println("adding veggies in all rounder sandwich");
    }

    //no hooks used
}
