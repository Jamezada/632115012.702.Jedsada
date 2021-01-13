package week6;
// Jedsada Kampen ID: 632115012
public class Programmer extends Person {
    String code;
    public Programmer(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void writecode(){
        System.out.println(name+" is write "+code+" code.");
    }
}