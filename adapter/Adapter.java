package adapter;

public class Adapter implements OldVersionLibrary{
    NewVersionLibrary nvl;

    public Adapter(NewVersionLibrary nvl) {
        this.nvl = nvl;
    }

    @Override
    public void printFeatureName() {
        nvl.newPrintFeatureName();
    }

    @Override
    public void performFeature() {
        nvl.newPerformFeature();
    }
}