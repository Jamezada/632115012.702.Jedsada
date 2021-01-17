package week7;

public class test {
    public static void main(String[] args) {
        Dog dog = new Dog("Lucky", "Pooddle", "brown", 2);
        dog.size = "Small";
        dog.shorthair = true;

        Fish fish = new Fish("Nemo", "ocellaris", "White orange", 1);
        fish.size = "Small";
        fish.speedfast = true;

        Bird bird = new Bird("Rio", "Macao", "ฺblue", 3);
        bird.country = "Brazil";
        bird.canfly = true;

        System.out.println("My dog");
        dog.showPetdata();
        dog.Run();
        dog.Bark();
        dog.isShorthair();
        System.out.println();

        System.out.println("My fish");
        fish.showPetdata();
        fish.IsSwimTotheSea();
        fish.SwimFast();
        System.out.println();

        System.out.println("My bird");
        bird.showPetdata();
        bird.Speak();
        bird.checkCountry();
        bird.IsCanFly();
    }
}
