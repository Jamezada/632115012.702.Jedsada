package week7;

public class Bicycle {
    int speed;

    public Bicycle(int speed) {
        if (speed > 99)
            this.speed = 99;
        else
            this.speed = speed;
    }

    public void speedup() {
        if (speed + 5 > 99)
            speed = 99;
        else
            speed += 5;
        System.out.println("Speed up!!");
    }

    public void breakBC() {
        speed -= 5;
        System.out.println("Break!!");
    }

    public void speedcheck() {
        System.out.println("Bicycle speed is " + speed);
    }
}
