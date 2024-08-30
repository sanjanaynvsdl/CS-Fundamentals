package Syncronization3;

public class Subtraction implements Runnable {
    public count counter;
    public Subtraction(count counter) {
        this.counter=counter;
    }
    @Override
    public void run() {
        for(int i=1;i<=10000;i++) {
            counter.value-=i;
        }
    }
    
}
