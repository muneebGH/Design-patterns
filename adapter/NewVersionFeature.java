package adapter;

public class NewVersionFeature implements NewVersionLibrary {
    @Override
    public void newPrintFeatureName() {
        System.out.println("new feature y");
    }

    @Override
    public void newPerformFeature() {

        System.out.println("performing new feature y");
    }
}
