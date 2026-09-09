abstract class Human {
    protected String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void talk(String sentence);
}

class Student extends Human {
    protected int student_ID;

    public Student(String name, int age, int student_ID) {
        super(name, age);
        this.student_ID = student_ID;
    }

    @Override
    public void talk(String sentence) {
        System.out.println("My name is " + name );
        System.out.println("STUDENT ID: " + student_ID );
        System.out.println("I think " + sentence );
        System.out.println("Perhaps, Maybe.\n");
    }
}

class Instructor extends Human {
    protected int faculty_ID;
    protected String lecture;

    public Instructor(String name, int age, int faculty_ID, String lecture) {
        super(name, age);
        this.faculty_ID = faculty_ID;
        this.lecture = lecture;
    }

    public void teach(String lecture) {
        this.lecture = lecture;
        System.out.println("Today we will learn about " + lecture + ". Is he or is he not the goat?");
        System.out.println();
    }

    @Override
    public void talk(String sentence) {
        System.out.println("My name is " + name );
        System.out.println("FACULTY ID: " + faculty_ID );
        System.out.println("I think " + sentence);
        System.out.println("He's the goat.\n");
    }
}

public class OOP {
    public static void main(String[] args) {
        Student myStudent = new Student("Bryce James", 16, 251237);
        Instructor myInstructor = new Instructor("Bronny James", 19, 2311111, "End");
        
        myInstructor.teach("Lebron JAMES");
        myInstructor.talk("He's not the goat");
        myStudent.talk("Let's study hard!");

    }
}
