package Bai2_DemNguoc;

public class demnguoc implements Runnable{
    @Override
    public void run() {
        for( int i = 10; i>=0;--i){
            System.out.println("Cac so dem nguoc tu 10->0 la: "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
