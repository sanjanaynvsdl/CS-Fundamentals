public class printNumbers {
    //print 100 numbers using different threads!
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int number = i;
            HelloPrinter task=new HelloPrinter();
            Thread thread = new Thread(task);
            thread.start();
        }
    }
}