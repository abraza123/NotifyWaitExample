import java.io.*;
import java.util.*;

public class WaitNotifyLive{

public static void main(String[] args) {
    
    WaitNotifyLive iPod = new WaitNotifyLive();
    //declaring new object
    Apple b = iPod.new Apple();
    b.start();
    //used to synchronized an object 
    synchronized(b){
        try{
        System.out.println("we are going to sychronize b ");
        b.wait();

    
    }
    catch(InterruptedException e){
        //prints stacked trace 
        e.printStackTrace();
    }

    System.out.println("the total for the object is: " + b.total);

    }
   
   
    }
class Apple extends Thread{
int total;
    @Override
    public void run(){

        synchronized(this){
            for(int i=0; i<=45; i++){
                total += i;

           
            }

            notify();
        }
    }

}



}