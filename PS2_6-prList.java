import java.util.*;
class BillGenerator {
    int generatebill(int totalbill){
        return totalbill;
    }
    int generatebill(int totalbill,int discount){
        return totalbill - discount;
    }
    double generatebill(int totalbill,double discountper){
        return totalbill - (totalbill * discountper / 100);
    }
}
public class pr6PL {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        BillGenerator bg = new BillGenerator();
        System.out.println("Enter Total bill : ");
        int totalbill = sc.nextInt();  
        System.out.println("--Customer type--");
        System.out.println("1.Regular");
        System.out.println("2.Privileged");
        System.out.println("3.Festive Offer");
        System.out.println("Enter your choice : ");
        int a = sc.nextInt();
        switch(a)
        {
            case 1:
                int bill=bg.generatebill(totalbill);
                System.out.println("Final bill = " + bill);
                break;
            case 2:
                System.out.println("Enter Flat Disscount Amount : ");
                int b = sc.nextInt();
                int bill2=bg.generatebill(totalbill, b);
                System.out.println("Final bill = " + bill2);
                break;
            case 3:
                System.out.println("Enter Flat Disscount Amount : ");
                double c = sc.nextInt();
                double bill3=bg.generatebill(totalbill, c);
                System.out.println("Final bill = " + bill3);
                break;
            default :
                System.out.println("Invalid choice");
        }
    }
}
