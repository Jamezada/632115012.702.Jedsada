package week7;

public class Dog extends Pets {
    String size;
    boolean shorthair;

    public Dog(String name,String species,String color,int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void Run(){
        System.out.println("My dog "+name+" is run to the jungle.");
    }
    public void Bark(){
        System.out.println(size+" bark Box Box!!");
    }
    public void isShorthair(){
        System.out.println("Short hair: "+shorthair);
    }
}
