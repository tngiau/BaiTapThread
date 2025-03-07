package Bai1_3;

public class Rectangle {
    private float width;
    private float lenght;
    public Rectangle(float width, float lenght){
        this.width = width;
        this.lenght = lenght;
    }
    public float getWidth() {
        return width;
    }
    public float getLenght() {
        return lenght;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public void setLenght(float lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
        return width*lenght;
    }
    public double getPerimeter(){
        return (width+lenght)*2;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "width=" + width +
                ", lenght=" + lenght +
                ']';
    }
}
