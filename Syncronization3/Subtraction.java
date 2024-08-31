package Syncronization3;
import java.util.concurrent.locks.Lock;

public class Subtraction implements Runnable {
    public count counter;
    public Lock lock;
    public Subtraction(count counter,Lock lock) {
        this.counter=counter;
        this.lock=lock;
    }
    @Override
    public void run() {
        for(int i=1;i<=10000;i++) {
            lock.lock();
            counter.value-=i;
            lock.unlock();
        }
    }
    
}
