package template.sandwichMaker;

public class VegetableSandwichMaker extends SandwichMaker{
    @Override
    protected void putButter() {
        System.out.println("putting butter on vegetable sandwich");
    }

    @Override
    protected void putMeat() {
        //do nothing because it will not contain meat
    }

    @Override
    protected void putVeggies() {
        System.out.println("putting vegetables on vegetable sandwich");
    }

    //using hook
    @Override
    protected boolean wantMeat() {
        return false;
    }
}
