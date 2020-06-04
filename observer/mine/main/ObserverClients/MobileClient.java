package observer.mine.main.ObserverClients;

import observer.mine.main.CricketDataUpdater;
import observer.mine.utils.Observable;
import observer.mine.utils.Observer;

public class MobileClient implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi i am mobile client and i got notification that data is updated");
        System.out.println("sending notifcation on my notification center with data");

        CricketDataUpdater.Data data=(CricketDataUpdater.Data)arg;
        System.out.println("Score :"+data.getScore());
        System.out.println("Outs :"+data.getOuts());
        System.out.println("Overs :"+data.getOvers());
    }

    public MobileClient(Observable observable) {
        observable.addObserver(this);
    }
}
