package adapter;

public class OldVersionFeature implements OldVersionLibrary {
    @Override
    public void printFeatureName() {
        System.out.println("feature x of old version library");
    }

    @Override
    public void performFeature() {
        System.out.println("performing feature x of old version library");
    }
}
