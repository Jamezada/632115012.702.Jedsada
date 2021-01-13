package week5.Lab701;

public class NerfGun {
    // Jedsada Kampen SID: 632115012
    private int ammuition;
    private static int IDGun;

    public NerfGun() {
        ammuition = 0;
        IDGun++;
    }

    public NerfGun(int ammuition) {
        this.ammuition = ammuition;
        IDGun++;
    }

    public void fire() {
        if (ammuition > 0) {
            System.out.println("BANG !!!");
            ammuition--;
        } else
            System.out.println("There is no ammuition");
    }

    public void displayNumOfAmmunition() {
        System.out.println(ammuition + " bullet left");
    }

    public void reload(int bullet) {
        if (ammuition + bullet <= 15)
            ammuition += bullet;
        else
            System.out.println("Error!! the ammuition is overload");
    }

    public void displayGunID() {
        System.out.println("The ID of this gun is " + IDGun);
    }

}