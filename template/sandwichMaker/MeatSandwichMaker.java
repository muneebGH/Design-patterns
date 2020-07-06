package template.sandwichMaker;

public class MeatSandwichMaker extends SandwichMaker{
    @Override
    protected void putButter() {
        System.out.println("putting large amount of butter on meat sandwich");
    }

    @Override
    protected void putMeat() {
        System.out.println("putting meat on meat sandwich");
    }

    @Override
    protected void putVeggies() {

        //do nothing because its meat sandwich
    }

    //hook

    @Override
    protected boolean wantMeat() {
        return false;
    }
}
