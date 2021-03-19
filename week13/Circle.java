package week13;

public class Circle extends Shape {
    final static double PI = 3.14;
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public double getArea(){
        return PI*(Math.pow(radius, 2));
    }
}
