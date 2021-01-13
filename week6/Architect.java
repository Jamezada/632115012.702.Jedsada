package week6;
// Jedsada Kampen ID: 632115012
public class Architect extends Person {
    String thing;
    public Architect(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void design(){
        System.out.println(name+" is design "+thing+".");
    }
}