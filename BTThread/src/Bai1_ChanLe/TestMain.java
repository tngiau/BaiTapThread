package Bai1_ChanLe;

public class TestMain {
    public static void main(String[] args) {
        Runnable eventhread = new EvenThread();
        Thread even = new Thread(eventhread);
        Runnable oddthread = new OddThread();
        Thread odd = new Thread(oddthread);
        even.start();
        odd.start();
    }
}
