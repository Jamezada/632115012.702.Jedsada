package week7;

public class Fish extends Pets {
    String size;
    boolean saltwater;
    boolean speedfast;

    public Fish(String name,String species,String color,int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void IsSwimTotheSea(){
        System.out.println("Swim to the sea: "+saltwater);
    }
    public void SwimFast(){
        System.out.println("Swim fast: "+speedfast);
    }
}