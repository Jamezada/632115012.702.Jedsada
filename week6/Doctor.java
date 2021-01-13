package week6;
// Jedsada Kampen ID: 632115012
public class Doctor extends Person {
    String organ;
    public Doctor(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void toTreat(){
        System.out.println(name+" is treating "+organ+".");
    }
}
