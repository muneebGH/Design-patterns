package adapter;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        //client will use same old feature
        OldVersionLibrary oldFeature=new OldVersionFeature();
        //calls will go to new library
        NewVersionLibrary newFeature=new NewVersionFeature();
        //using this adapter
        Adapter adapter=new Adapter(newFeature);
        testFeature(adapter);


    }

    public static void testFeature(OldVersionLibrary ovl){
        //this client function will stay same and accept old lib but using adapter new lib func will execute
        ovl.performFeature();
        ovl.printFeatureName();
    }


}
