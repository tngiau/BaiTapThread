package Dung_Runnable;

public class MyClient {
    public static void main(String[] args) {
       // MyTask t1 = new MyTask(5,"Hello");
        //MyTask t2 = new MyTask(5,"World");
       // t1.run();
       // t2.run(); //SU DUNG DON LUONG


        Runnable task1 = new MyTask(50,"Hello");
        Thread t1 = new Thread(task1); //TAO MOI THREAD DE LUU TRU task1
        Runnable task2 = new MyTask(50,"World");
        Thread t2 = new Thread(task2);
        t1.start(); //KHI TAO HAI START NAY THI PHUONG THU run SE TU DONG KICH HOAT
        t2.start();
        //HAI TASK SE CHAY SONG SONG NHAU,KHONG CHO NHAU
        //MIEN LA KHI CPU ranh => MOT THREAD KIA NGHI, THI THREAD KHAC SE THAY VAO CHAY, VA LAP LAI NHU THE



    }
}
