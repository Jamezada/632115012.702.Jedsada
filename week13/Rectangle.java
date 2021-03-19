package week13;

public class Rectangle extends Shape{
    private int width;
    private int length;

    public Rectangle(int w,int l){
        this.length = l;
        this.width = w;
    }

    public double getArea(){
        return length*width;
    }
}
