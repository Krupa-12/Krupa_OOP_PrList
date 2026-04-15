package pkg240760107009_oop;
import java.util.Scanner;
class University {
    static int totalStudents;
    static String universityName;
    static {
        universityName = "Nirma University";
        System.out.println("Static Block Executed");
        System.out.println("University Name Initialized: " + universityName);
    }
    {
        System.out.println("Instance Block Executed - A student object is created");
        totalStudents++;
    }
    String studentName;
    University(String name) {
        studentName = name;
        System.out.println("Constructor Executed for student: " + studentName);
    }
    static int getTotalStudents() {
        return totalStudents;
    }
}
public class pr8PL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        University students[] = new University[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            students[i] = new University(name);
        }
        System.out.println("\nTotal Students Created: " + University.getTotalStudents());
    }
}
