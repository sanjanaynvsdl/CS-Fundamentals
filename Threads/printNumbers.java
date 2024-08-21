public class printNumbers {
    //print 100 numbers using different threads!
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            HelloPrinter task=new HelloPrinter(i);
            Thread thread = new Thread(task);
            thread.start();
        }
    }
}