package week7;

public class Bird extends Pets {
    String country;
    boolean canfly;

    public Bird(String name,String species,String color,int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void Speak(){
        System.out.println("Hi hello hello!!");
    }
    public void checkCountry(){
        System.out.println("Country is "+country);
    }
    public void IsCanFly(){
        System.out.println("Can fly: "+canfly);
    }
}
