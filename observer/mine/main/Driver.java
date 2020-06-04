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

    static void runWithThreads(){
        CricketDataUpdater cricketDataUpdater=new CricketDataUpdater();
        TVClient tv=new TVClient(cricketDataUpdater);
        MobileClient mobile=new MobileClient(cricketDataUpdater);
        ThirdPartyClient thirdPartyClient=new ThirdPartyClient(cricketDataUpdater);
        class MyThread implements Runnable {


            final int incrementalStep;
            @Override
            public void run() {
                for(int i=0;i<20;i++){
                    try {
                        Thread.sleep(3000);

                    }catch (Exception e){
                        System.out.println(e.getLocalizedMessage());
                    }
                    cricketDataUpdater.incrementAll(incrementalStep);
                }

                
            }

            public MyThread(int incrementalStep) {
                this.incrementalStep = incrementalStep;
            }
        }

        MyThread thread=new MyThread(2);
        new Thread(thread).start();
    }

    public static void main(String[] args) {
        //Driver.runWithoutThreads();
        //uncomment and use runWithoutThreads to increment data in cricketDataUpdater manually on same thread
        //and program will run sequentially

        //Driver.runWithThreads();
        //uncomment and use runWithThreads and program will create another thread and will update the data
        //on its own on another thread


    }
}
