package singleton;

public class Driver {


    public static void main(String[] args) {
        Consumer a=new Consumer();
        a.setConnection(SharedDBConnection.getInstance());
        Consumer b=new Consumer();
        b.setConnection(SharedDBConnection.getInstance());
        System.out.println("A is consuming the connection instance");
        a.consumeAndUseConnection();
        System.out.println("B is consuming the connection instance");
        b.consumeAndUseConnection();
        System.out.println("ID of connection A consumed");
        a.printConsumedConnectionID();
        System.out.println("ID of connection B consumed");
        b.printConsumedConnectionID();
    }
}
