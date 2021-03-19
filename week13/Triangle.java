package week13;

public class Triangle extends Shape{
    private int width;
    private int high;
    
    public Triangle(int w,int h){
        this.high = h;
        this.width = w;
    }

    public double getArea(){
        return (width*high)/2;
    }
}
