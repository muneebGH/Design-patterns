package observer.mine.main.ObserverClients;

import observer.mine.main.CricketDataUpdater;
import observer.mine.utils.Observable;
import observer.mine.utils.Observer;

public class TVClient implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi i am TV client and i got notification that data is updated");
        System.out.println("printing data on my screen for viewers");

        CricketDataUpdater.Data data=(CricketDataUpdater.Data)arg;
        System.out.println("Score :"+data.getScore());
        System.out.println("Outs :"+data.getOuts());
        System.out.println("Overs :"+data.getOvers());
    }

    public TVClient(Observable observable) {
        observable.addObserver(this);
    }
}

