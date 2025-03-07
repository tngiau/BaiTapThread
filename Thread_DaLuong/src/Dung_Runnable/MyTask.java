package Dung_Runnable;

public class MyTask implements Runnable {
    private int times;
    private String name;

    public MyTask(int times, String name) {
        this.times = times;
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < this.times; i++) {
            System.out.println(this.name);
        }//PHUONG THUC NAY SE TU DONG GOI

    }


}
