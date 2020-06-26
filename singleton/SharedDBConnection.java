package singleton;

public class SharedDBConnection {
   private static SharedDBConnection singletonObject=new SharedDBConnection();
   private SharedDBConnection(){}
   public static SharedDBConnection getInstance(){
       return singletonObject;
   }


   public void printConnectionID(){
       System.out.println(hashCode());
   }
   public void performDBActions(){
       System.out.println("performing actions");
   }

}
