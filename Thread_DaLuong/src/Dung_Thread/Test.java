package Dung_Thread;

public class Test {
    public static void main(String[] args) {
        Thread task1 = new MyTask1("Ngoc",50);
        Thread task2 = new MyTask1("Mundo",50);
        task1.start();
        task2.start();
        //NEU DUNG extends TA CHI DUOC KE THUA MOT LOP CHA DUY NHAT LA thread
        //NEU DUNG interface CO THE CO NHIEU LOP CHA HON
        //NHUNG TUY VAO NHU CAU SU DUNG, TRUONG HOP
    }
}
