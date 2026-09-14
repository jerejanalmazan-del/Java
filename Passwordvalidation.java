
import java.util.Scanner; 

public class Passwordvalidation {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int passwordLength = 8;
        boolean valid = false;

        for (int attempts = 1; attempts <= 3; attempts++) {
            System.out.print("Enter your password: ");
            String password = sc.nextLine();

            if (password.length() >= passwordLength &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*\\d.*")) {
                System.out.println("Your password is valid!");
                valid = true;
                break;
            } else {
                System.out.println("Invalid password. (" + (3 - attempts) + " tries left)");
            }
        }

        if (!valid) {
            System.out.println("Too many failed attempts. Program terminated.");
        }

        sc.close();
    }
}