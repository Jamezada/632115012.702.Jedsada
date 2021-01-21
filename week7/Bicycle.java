package week7;

public class Bicycle {
    protected int speed;

    public Bicycle(int speed) {
        if (speed > 99)
            this.speed = 99;
        else
            this.speed = speed;
    }

    protected void speedup() {
        if (speed + 5 > 99)
            speed = 99;
        else
            speed += 5;
        System.out.println("Speed up!!");
    }

    protected void breakBC() {
        speed -= 5;
        System.out.println("Break!!");
    }

    protected void speedcheck() {
        System.out.println("Bicycle speed is " + speed);
    }
}
