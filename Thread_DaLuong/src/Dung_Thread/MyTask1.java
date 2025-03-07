package Dung_Thread;

public class MyTask1 extends Thread {
    private int times;
    private String name;
    public MyTask1(String name, int times) {
        this.name = name;
        this.times = times;
    }
    @Override
    public void run() {
        for (int i = 0; i < this.times; i++) {
            System.out.println(this.name);
        }
    }
}
