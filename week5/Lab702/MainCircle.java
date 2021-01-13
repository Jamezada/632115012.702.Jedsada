package week5.Lab702;

public class MainCircle {
    // Jedsada Kampen ID: 632115012
    public static void main(String[] args) {
        Circle cir1 = new Circle(0, 0, 2.0);
        Circle cir2 = new Circle(1.0, 2.0, 3.0);
        Circle cir3 = new Circle(3.0, 5.0);
        Circle cir4 = new Circle(-1.0, -1.0, -1.0);

        System.out.println("Area of cir1 = " + cir1.getArea());
        System.out.println("Circumferrene of cir1 = " + cir1.getCircum());
        System.out.println("Area of cir2 = " + cir2.getArea());
        System.out.println("Circumferrene of cir2 = " + cir2.getCircum());
        System.out.println("Area of cir3 = " + cir3.getArea());
        System.out.println("Circumferrene of cir3 = " + cir3.getCircum());
        System.out.println("Area of cir4 = " + cir4.getArea());
        System.out.println("Circumferrene of cir4 = " + cir4.getCircum());
        System.out.println("Is ciecle 1 intersec circle 2: " + cir1.Intersection(cir2));
        System.out.println("Is ciecle 1 intersec circle 3: " + cir1.Intersection(cir3));
        System.out.println("Is ciecle 2 intersec circle 3: " + cir2.Intersection(cir3));
    }
}

class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        if (this.radius < 0)
            this.radius = 0.0;
    }

    public Circle(double x, double y) {
        this(x, y, 1.0);
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircum() {
        return 2 * Math.PI * radius;
    }

    public boolean Intersection(Circle cir) {
        double rang;

        rang = Math.sqrt(Math.pow(this.x - cir.x, 2) + Math.pow(this.y - cir.y, 2));
        if (rang < this.radius + cir.radius)
            return true;
        else
            return false;
    }
}