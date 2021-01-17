package week7;

public class Pets {
    String name;
    String species;
    String color;
    int age;

    public Pets(){

    }
    public Pets(String name,String species,String color,int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void showPetdata() {
        System.out.println("Name: " + name + " Species: " + species + " Color: " + color + " Age: " + age);
    }
}