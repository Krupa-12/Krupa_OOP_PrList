import java.util.*;
public class pr2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five digit number: ");
        int num = sc.nextInt();
        int result = 0;
        int index = 1;
        while(num > 0) {
            int digit = num % 10;    
            digit = (digit + 1) % 10;  
            result = result + digit * index;
            index = index * 10;
            num = num / 10;          
        }
        System.out.println("New number: " + result);
    }
}
