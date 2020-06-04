package observer.java;

import java.util.Observable;


public class CricketDataUpdater extends Observable {
    public class Data{
        private int score;
        private int outs;
        private int overs;

        private Data() {
            score = 0;
            outs = 0;
            overs = 0;
        }

        public int getScore() {
            return score;
        }

        public int getOuts() {
            return outs;
        }

        public int getOvers() {
            return overs;
        }
    }

    private Data data;


    CricketDataUpdater() {
        data=new Data();
    }

    public void incrementAll(int by) {
        data.score = data.score + by;
        data.outs = data.outs + by;
        data.overs = data.overs + by;
        setChanged();
        notifyObservers(data);

    }

    public void incrementScore(int by) {
        data.score = data.score + by;
        setChanged();
        notifyObservers(data);
    }


    public void incrementOvers(int by) {
        data.score = data.score + by;
        setChanged();
        notifyObservers(data);
    }

    public void incrementOuts(int by) {
        data.score = data.score + by;
        setChanged();
        notifyObservers(data);
    }

}





