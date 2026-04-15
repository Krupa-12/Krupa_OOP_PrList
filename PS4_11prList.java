import java.util.*;
class Payment {
    void processPayment(int amount) {
        System.out.println("Processing general payment of Rs. " + amount);
    }
}
class CreditCardPayment extends Payment {
    @Override
    void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done using Credit Card.");
    }
}
class UPIPayment extends Payment {
    @Override
    void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done using UPI.");
    }
}
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an amount: ");
        int amount = sc.nextInt();
        System.out.println("\nSelect Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        Payment p; 
        switch (choice) {
            case 1:
                p = new CreditCardPayment();
                p.processPayment(amount);
                break;
            case 2:
                p = new UPIPayment();
                p.processPayment(amount);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        sc.close();
    }
}
