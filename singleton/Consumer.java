package singleton;

public class Consumer {
    SharedDBConnection conn;

    public Consumer(){
        this.conn=null;
    }
    public Consumer(SharedDBConnection conn) {
        this.conn = conn;
    }

    public void setConnection(SharedDBConnection conn){
        this.conn=conn;
    }
    public void consumeAndUseConnection(){
        conn.performDBActions();
    }
    public void printConsumedConnectionID(){
        conn.printConnectionID();
    }
}
