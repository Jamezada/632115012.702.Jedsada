package week13;

public class TestAbstract{
    public static void main(String[] args) {
        Shape cir = new Circle(5);
        Shape rec = new Rectangle(5, 5);
        Shape tri = new Triangle(5, 5);

        System.out.println(cir.getArea());
        System.out.println(rec.getArea());
        System.out.println(tri.getArea());
    }
}