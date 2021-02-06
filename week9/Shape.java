package week9;

public class Shape {
    public String toString() {
        return "This is a shape";
    }

    public static void main(String[] args) {
        Cube cube1 = new Cube(5, 5, 5);

        System.out.println(cube1.toString());
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // overiding toString()
    @Override
    public String toString() {
        return super.toString() + "\nThis is a rectangle with width as " + width + " and height as " + height;
    }
}

class Cube extends Rectangle {
    private int length;

    public Cube(int width, int height, int length) {
        super(width, height);
        this.length = length;
    }

    // overiding toString()
    @Override
    public String toString() {
        return super.toString() + "\nThis is a cube with the side of " + length;
    }
}
