package template.sandwichMaker;

abstract public class SandwichMaker {
    final public void makeSandwich(){
        cutBread();
        if(wantButter()){
            putButter();
        }
        if(wantMeat()){
            putMeat();
        }
        if(wantVeggies()){
            putVeggies();
        }

        wrapUp();

    }

    //concrete methods
    private void cutBread(){
        System.out.println("cutting the bread");
    }
    private void wrapUp(){
        System.out.println("wrapping up");
    }

    // abstract : must implement methods
    abstract protected void putButter();
    abstract protected void putMeat();
    abstract protected void putVeggies();

    //hooks
    protected boolean wantButter(){
        return true;
    }

    protected boolean wantMeat(){
        return true;
    }

    protected boolean wantVeggies(){
        return true;
    }

}
