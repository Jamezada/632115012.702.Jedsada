package week10;

public class Human {
    public void hit(Animal animal){
        System.out.println(animal.roar());
    }

    public static void main(String[] args) {
        Animal dog = new Dog(); //Question 1
        Human hunam = new Human();
        System.out.println("The first calling hit(Animal)");
        hunam.hit(dog); //Question 2

        dog = new Cat();
        System.out.println("The second calling hit(Animal)");
        hunam.hit(dog); //Question 3

        dog = new Fish();
        System.out.println("The third calling hit(Animal)");
        hunam.hit(dog);
    }
}
