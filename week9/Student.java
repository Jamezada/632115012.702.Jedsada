package week9;

public class Student {
    private String firstname = "Hello";
    private String lastname = "World";
    public Student(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
    //overiding toString()
    public String toString(){
        return "My first name "+firstname+" last name "+lastname;
    }
    public static void main(String[] args) {
        Student p = new Student("Jedsada","Kampen");
        System.out.println(p.toString());
    }
}
