package week11;

public class StudentData {
    public static void main(String[] args) {
        // Student odject include name,age,gpa
        Student std01 = new Student("Mark", 18, 4.00);
        Student std02 = new Student("Jane", 18, 2.20);
        Student std03 = new Student("Peter", 19, 4.00);
        Student std04 = new Student("Mark", 22, 1.75);

        // Write the equal statement to test the objects below
        // name
        System.out.println(std01.equals(std02.getName()));
        System.out.println(std01.equals(std03.getName()));
        System.out.println(std02.equals(std04.getName()));
        System.out.println(std01.equals(std04.getName()) + "\n");
        // age
        System.out.println(std01.equals(std02.getAge()));
        System.out.println(std03.equals(std04.getAge()));
        System.out.println(std01.equals(std03.getAge()) + "\n");
        // GPA
        System.out.println(std01.equals(std03.getGPA()));
        System.out.println(std02.equals(std04.getGPA()));
        System.out.println(std02.equals(std03.getGPA()));
    }
}

class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGPA() {
        return gpa;
    }

    // @Override
    // public boolean equals(Object obj) {
    //     if (obj == null) {
    //         return false;
    //     }
    //     if (this.getName() == ((Student) obj).getName()) {
    //         return true;
    //     } else if (this.getAge() == ((Student) obj).getAge()) {
    //         return true;
    //     } else if (this.getGPA() == ((Student) obj).getGPA()) {
    //         return true;
    //     } else
    //         return false;
    // }
    
    public boolean equals(String name){
        return this.getName().equals(name);
    }
    
    public boolean equals(Integer age){
        return this.getAge() == age;
    }

    public boolean equals(Double gpa){
        return this.getGPA() == gpa;
    }
}