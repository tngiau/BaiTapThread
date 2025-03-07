package Bai3_BanAn;

public class Banan {
    private int Toida = 5;
    private int soMonAn = 0;

    public synchronized void DauBep() throws InterruptedException {
        while (soMonAn == Toida) {
            System.out.println("Bàn ăn đã đầy, đầu bếp vui lòng đợi!!");
            wait();
        }
        Thread.sleep(2000);
        soMonAn++;
        System.out.println("Đầu bếp đã nấu xong một món. Số món ăn: " + soMonAn);
        notifyAll();
    }

    public synchronized void KhachHang() throws InterruptedException {
        while (soMonAn == 0) {
            System.out.println("Bàn ăn đang trống, khách hàng vui lòng đợi!!");
            wait();
        }
        Thread.sleep(3000);
        soMonAn--;
        notifyAll();
        System.out.println("Khách hàng đã ăn xong một món. Số món ăn: " + soMonAn);
    }
}
