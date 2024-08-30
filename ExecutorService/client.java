package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class client {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //By default it will create thread pool of size 10 and queue od size random(we didn't fix size of queue)
        for(int i=1;i<=100;i++) {
            if(i==10) {
                System.out.println("10th task submitted");
            }
            HelloPrinter task = new HelloPrinter(i);

            executorService.execute(task);
        }
        // executorService.shutdown();
    }
}
