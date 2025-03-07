package Starvation;

public class Sualoi {

        public static void main(String[] args) {
            Thread highPriority = new Thread(() -> {
                while (true) {
                    System.out.println("High Priority Thread running...");
                    Thread.yield();
                }
            });

            Thread lowPriority = new Thread(() -> {
                while (true) {
                    System.out.println("Low Priority Thread running...");
                    Thread.yield();
                }
            });

            highPriority.setPriority(Thread.MAX_PRIORITY);
            lowPriority.setPriority(Thread.MIN_PRIORITY);

            highPriority.start();
            lowPriority.start();
        }
    }


