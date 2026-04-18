import java.util.Scanner;
public class main{
    public static boolean Password(String password) {
        if (password.length() < 8) {
            return false;
        }
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }
        return digitCount >= 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = sc.nextLine();
        if (Password(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
