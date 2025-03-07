package Bai3_BanAn;

public class Test {
    public static void main(String[] args) {
        Banan banan = new Banan();
        Thread bep = new Thread(() -> {
            while (true) {
                try {
                    banan.DauBep();
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        });
        Thread khach = new Thread(() -> {
            while (true) {
                try {
                    banan.KhachHang();
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        });
        bep.start();
        khach.start();




    }
}
