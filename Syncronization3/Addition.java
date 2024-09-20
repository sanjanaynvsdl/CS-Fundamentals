package Syncronization3;
import java.util.concurrent.locks.Lock;

public class Addition implements Runnable {
    public count counter;
    public Lock lock;
    public Addition(count counter,Lock lock) {
        this.counter=counter;
        this.lock=lock;
    }
    @Override
    public void run() {
        for(int i=1;i<=50;i++) {
            lock.lock();
            counter.value+=i;
            System.out.println("The value of the counter is: "+counter.value);
            lock.unlock();
        }

    }    
}
