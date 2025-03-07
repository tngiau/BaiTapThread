package Starvation;

public class StarvationExample {
    public static void main(String[] args) {
        Thread highPriority = new Thread(()->{
            while (true)
                System.out.println("High Priority Thread running...");
        });
        Thread lowPriority = new Thread(()->{
            while (true)
                System.out.println("Low Priority Thread running...");
        });
        highPriority.setPriority(Thread.MAX_PRIORITY);
        lowPriority.setPriority(Thread.MIN_PRIORITY);
        highPriority.start();
        lowPriority.start();
    }
}
