import java.util.Scanner;

public class SalesReceipt {
    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Price of item 1    : ");
        double item1= sc.nextDouble();
        System.out.print("Price of item 2    : ");
        double item2 = sc.nextDouble();
        System.out.print("Price of item 3    : ");
        double item3 = sc.nextDouble();
        System.out.print("Quantity of item 1 : ");
        int quantity1 = sc.nextInt();
        System.out.print("Quantity of item 2 : ");
        int quantity2 = sc.nextInt();
        System.out.print("Quantity of item 3 : " );
        int quantity3 = sc.nextInt();
        
        System.out.print("______________________________________ \n");
        
        double Subtotal = (item1 * quantity1) + (item2 * quantity2) + (item3 * quantity3);
        System.out.printf("➤Subtotal          : %.2f\n", Subtotal);
        double Discount = Subtotal*0.05;
        System.out.printf("➤Discount          : %.2f\n", Discount);
        double Salestax = 0.12*(Subtotal-Discount);
        System.out.printf("➤Sales Tax         : %.2f\n", Salestax);
        double Finaltotal= Subtotal-Discount+Salestax;
        System.out.printf("➤Final Total       : %.2f\n", Finaltotal);
        
        
    }
}
