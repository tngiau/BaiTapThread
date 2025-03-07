package Bai1_2;

public class TestMain {
    public static void main(String[] args) {
        Circle c1 = new Circle ( 1.1);
        System.out.println(c1);
        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("Radius is " + c1.getRadius());
        System.out.println("Area is " + c1.getArea());
        System.out.println("Circumference is " + c1.getCircumference());
    }

}
