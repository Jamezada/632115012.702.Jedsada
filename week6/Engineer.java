package week6;
// Jedsada Kampen ID: 632115012
public class Engineer extends Person {
    String work;
    public Engineer(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void design(){
        System.out.println(name+" is design "+work+".");
    }
}
