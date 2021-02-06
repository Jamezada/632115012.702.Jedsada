package week9;

public class Person {
    String name;
    int bornYear;

    public Person(String name, int bornYear) {
        this.name = name;
        this.bornYear = bornYear;
    }

    public void introduce() {
        System.out.print("\nMy name is " + name + ",");
        System.out.println("I was born in " + bornYear + ".");
    }
}

class Sheriff extends Person {
    String workState;

    public Sheriff(String name, int bornYear, String workState){
        super(name, bornYear);
        this.workState = workState;
    }

    // overiding method
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I'm a sheriff and work in " + workState + ".");
    }
}

class Teacher extends Person {
    String workState;

    public Teacher(String name, int bornYear, String workState){
        super(name, bornYear);
        this.workState = workState;
    }

    // overiding method
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I'm a teacher and teach the students in " + workState + ".");
    }
}

class Prime extends Person {
    String country;

    public Prime(String name, int bornYear, String country){
        super(name, bornYear);
        this.country = country;
    }

    // overiding method
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I'm a prime minister and work in " + country + ".");
    }
}

class FBplayer extends Person {
    String FBclube;

    public FBplayer(String name, int bornYear, String FBclube){
        super(name, bornYear);
        this.FBclube = FBclube;
    }

    // overiding method
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I'm a football player and work in " + FBclube + " football club");
    }
}

class Survey extends Person {
    String wall;

    public Survey(String name, int bornYear, String wall){
        super(name, bornYear);
        this.wall = wall;
    }

    // overiding method
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I'm a Survey unit and work in " + wall + ".");
    }
}