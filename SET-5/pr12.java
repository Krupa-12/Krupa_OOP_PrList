import java.util.*;
interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}
abstract class PartialOrder implements Order {
    protected String itemName;
    protected int quantity;
    protected int orderId;
    protected double price;
    @Override
    public void placeOrder(String item, int qty) {
        this.itemName = item;
        this.quantity = qty;
        System.out.println("\n[System] Order placed for: " + qty + " x " + itemName);
    }
}
class FinalOrder extends PartialOrder {
    FinalOrder(int orderId, double price) {
        this.orderId = orderId;
        this.price = price;
    }
    @Override
    public void cancelOrder(int orderId) {
        if (this.orderId == orderId) {
            System.out.println("\n[Success] Order ID " + orderId + " has been cancelled.");
        } else {
            System.out.println("\n[Error] Invalid Order ID. Cancellation failed.");
        }
    }
    @Override
    public void generateBill() {
        double total = quantity * price;
        System.out.println("\n======= || FINAL BILL || =======");
        System.out.println("Order ID       : " + orderId);
        System.out.println("Item Name      : " + itemName);
        System.out.println("Quantity       : " + quantity);
        System.out.println("Price per unit : Rs. " + price);
        System.out.println("--------------------------------");
        System.out.println("Total Amount   : Rs. " + total);
        System.out.println("================================\n");
    }
}
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Order ID: ");
        int orderId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Item Name: ");
        String itemName = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        System.out.print("Enter Price per item: ");
        double price = sc.nextDouble();
        FinalOrder order = new FinalOrder(orderId, price);
        order.placeOrder(itemName, qty);
        System.out.println("\n--- Choose Action ---");
        System.out.println("1. Generate Bill");
        System.out.println("2. Cancel Order");
        System.out.print("Choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                order.generateBill();
                break;
            case 2:
                System.out.print("Confirm Order ID to cancel: ");
                int cancelId = sc.nextInt();
                order.cancelOrder(cancelId);
                break;
            default:
                System.out.println("Invalid selection.");
                break;
        }
        sc.close();
    }
}
