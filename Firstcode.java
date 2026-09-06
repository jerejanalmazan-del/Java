import java.util.Scanner;

public class Firstcode {
    

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String firstname;
     String secondname;   
     
        System.out.println("What is your first name? ");
        firstname = sc.nextLine();
        System.out.println("What is your second name? ");
        secondname = sc.nextLine();
        System.out.print("Enter a number: ");
        double wazzap = sc.nextDouble();

        for (int i = 1; i <= wazzap; i++) {
             if (i % 3 == 0 && i % 5 == 0 && i == wazzap) {
                    System.out.println("Hello");
                } else if (i % 2 == 0) {
                    System.out.println("Hi");
                } else if (i % 3 == 0) {
                    System.out.println(firstname);
                } else if (i % 5 == 0) {
                    System.out.println(secondname);
                } else {
                System.out.println("Welcome");
            }
        }
      sc.close();
    }
}
