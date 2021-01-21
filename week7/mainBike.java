package week7;

public class mainBike {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle(10);
        mountainBike bike2 = new mountainBike(10);

        bike1.speedup();
        bike1.speedcheck();
        bike1.breakBC();
        bike1.speedcheck();

        System.out.println();

        bike2.gearset(2);
        bike2.speedup();
        bike2.speedcheck();
        bike2.breakBC();
        bike2.speedcheck();
    }
}
