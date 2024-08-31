public class ThreadDemo{
    public static void main(String[] args) {
        System.out.println("Helloo...");
        //As of now we did not create any thread, but java by default creates a thread called main thread
        System.out.println("hello "+Thread.currentThread().getName());

        //----------------- what should we do to print this is in another thread ------------
        //1.create a task
        HelloPrinter task=new HelloPrinter(1);

        //2.create a new thread
        //3.assign the task to the thread
        Thread thread=new Thread(task);
        //4. Start the thread
        thread.start();
        // System.out.println("Hello from "+thread.getName());

    }
}

