package Bai2_DemNguoc;

public class Test {
    public static void main(String[] args) {
        Runnable helo = new demnguoc() {};
        Thread hello = new Thread(helo);
        hello.start();
    }
}
