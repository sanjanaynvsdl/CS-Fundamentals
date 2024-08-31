package Syncronization3;
import java.util.*;
import java.util.concurrent.locks.*;


//In this scenario This is calles problem of sychronization
//Question- if the main thread is waiting for both the threads then why the counter value differs?
//We have main thread
//Adder and Subtractor threads- they are modifying the value of the counter
//After the completion of the adder,subtractor thread main thread will print the value of the counter
//.join() excepts the try-catch block or throws InterruptedException.
//So, I have added throws InterruptedException in the main method
//Also, we will get multiple values of the counter because of the 
public class Main1 {
    public static void main(String[] args)  throws InterruptedException{
        count counter=new count();
        Lock lock=new ReentrantLock(); 

        Addition add=new Addition(counter,lock);
        Subtraction sub=new Subtraction(counter,lock);

        Thread adderThread=new Thread(add);
        Thread subtractorThread=new Thread(sub);

        adderThread.start();
        subtractorThread.start();

        adderThread.join();
        subtractorThread.join();
        //we used .join() main thread waits for the adderThread and subtractorThread to finish
        //Then the main thread will print the value of the counter

        System.out.println("The value of the counter is: "+counter.value);
    }
    
}
