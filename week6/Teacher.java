package week6;
// Jedsada Kampen ID: 632115012
public class Teacher extends Person{
    String student;
    public Teacher(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void teach(){
        System.out.println(name+" is teach "+student+".");
    }
}
