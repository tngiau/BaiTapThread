package Race_Condition;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread c1 = new Thread(()->{
            for(int i = 0; i<1000;i++)
                counter.increment();

        });
        Thread c2 = new Thread(()->{
            for(int i = 0; i<1000;i++)
                counter.increment();

        });
        c1.start();
        c2.start();
        c1.join();
        c2.join();
        System.out.println("Final count: " + counter.getCount());
    }
}
