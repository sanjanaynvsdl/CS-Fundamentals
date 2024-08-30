public class HelloPrinter implements Runnable {
    private int num;
    public HelloPrinter(int num) {
        this.num=num;
    }
    @Override
    public void run() {
        System.out.println(num +" "+"Printed by"+" "+ Thread.currentThread().getName());
    }
    
}
