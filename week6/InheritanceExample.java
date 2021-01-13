package week6;
// Jedsada Kampen ID: 632115012
public class InheritanceExample {
    public static void main(String[] args) {
        Artist art = new Artist("Ball", 20,"Male");
        Programmer code = new Programmer("Bill", 20, "Male");
        Architect arc = new Architect("Mill", 21, "Female");
        Doctor medic = new Doctor("New", 25, "Female");
        Engineer eng = new Engineer("Kill", 22, "Male");
        Teacher ta = new Teacher("Hill", 30, "Male");

        art.genre = "hip hop";
        art.introduce();
        art.playMusic();
        System.out.println();
        code.code = "java";
        code.introduce();
        code.writecode();
        System.out.println();
        arc.thing = "home";
        arc.introduce();
        arc.design();
        System.out.println();
        medic.organ = "heart";
        medic.introduce();
        medic.toTreat();
        System.out.println();
        eng.work = "home";
        eng.introduce();
        eng.design();
        System.out.println();
        ta.student = "Jedsada";
        ta.introduce();
        ta.teach();
    }
}
