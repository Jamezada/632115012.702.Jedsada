package week7;

public class mountainBike extends Bicycle {
    private int gear;

    public mountainBike(int speed) {
        super(speed);
    }

    public void gearset(int num) {
        gear = num;
        System.out.println("Change gear " + num);
    }

    @Override
    protected void speedup() {
        if (speed + 5 * gear > 99)
            speed = 99;
        else
            speed += 5 * gear;
        System.out.println("Speed up!!");
    }

    @Override
    protected void breakBC() {
        speed -= 5;
        System.out.println("Break!!");
    }
}
