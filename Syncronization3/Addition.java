package Syncronization3;

public class Addition implements Runnable {
    public count counter;
    public Addition(count counter) {
        this.counter=counter;
    }
    @Override
    public void run() {
        for(int i=1;i<=10000;i++) {
            counter.value+=i;
        }

    }

    
}
