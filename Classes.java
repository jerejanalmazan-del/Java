class Animal {

    public int age;
    public String gender;

    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public boolean isMammal() {
        return false;
    }
    public void showInfo() {
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public void mate() {
        System.out.println("The animal can reproduce.");
    }

    public static void main(String[] args) {
        Classes.main(args);
    }
}

// Child Class: Duck
class Duck extends Animal {

    public String beakColor = "yellow";

    public Duck(int age, String gender) {
        super(age, gender);
    }
    
    
    
    public void beakColor(){
        System.out.println("Its beak is "+ beakColor + ".");
    }

    public void swim() {
        System.out.println("Duck is swimming.");
    }

    public void quack() {
        System.out.println("Duck is quacking!");
    }
}

// Child Class: Fish
class Fish extends Animal {

    // Not really using the attributes hereeee

    private int sizeInFt;
    private boolean canEat;

    public Fish(int age, String gender, boolean canEat) {
        super(age, gender);
        this.canEat = canEat;
    }

    private void swim() {
        System.out.println("Fish is swimming.");
    }

    public void showSwim() {
        swim();
    }
}

// Child Class: Zebra
class Zebra extends Animal {

    public boolean isWild;

    public Zebra(int age, String gender, boolean isWild) {
        super(age, gender);
        this.isWild = isWild;
    }
    public void isWild(){
        System.out.println("Zebra is wild.");
    }
    public void run() {
        System.out.println("Zebra is running.");
    }
}

// Main Class
public class Classes {

    public static void main(String[] args) {

        Duck duck = new Duck(2, "Male");
        Fish fish = new Fish(1, "Female", true);
        Zebra zebra = new Zebra(5, "Female", true);

        System.out.println("Duck");
        duck.showInfo();
        duck.beakColor();
        duck.swim();
        duck.quack();
        duck.mate();

        System.out.println("\nFish");
        fish.showInfo();
        fish.showSwim();
        fish.mate();

        System.out.println("\nZebra");
        zebra.showInfo();
        zebra.isWild();
        zebra.run();
        zebra.mate();
    }
}

 