package observer.mine.main;

import observer.mine.main.ObserverClients.MobileClient;
import observer.mine.main.ObserverClients.TVClient;
import observer.mine.main.ObserverClients.ThirdPartyClient;

public class Driver {

    static void runWithoutThreads(){
        CricketDataUpdater cricketDataUpdater=new CricketDataUpdater();
        TVClient tv=new TVClient(cricketDataUpdater);
        MobileClient mobile=new MobileClient(cricketDataUpdater);
        ThirdPartyClient thirdPartyClient=new ThirdPartyClient(cricketDataUpdater);
        cricketDataUpdater.incrementAll(1);
        cricketDataUpdater.incrementScore(20);
    }

    public static void main(String[] args) {
        Driver.runWithoutThreads();
    }
}
