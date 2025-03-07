package MemoryVisibilityIssue;

public class VisibilityExample {
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        Thread worker = new Thread(() -> {
            while (!flag) {

            }
            System.out.println("Flag changed!");
        });

        worker.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        flag = true;
    }
}

