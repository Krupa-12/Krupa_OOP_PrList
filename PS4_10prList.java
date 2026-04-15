import java.util.*;
class Vehicle {
    protected String vehicleNumber;
    protected String Brand;
    protected String fuelType;
    Vehicle(String Vnumber, String Vbrand, String Ftype) {
        vehicleNumber = Vnumber;
        Brand = Vbrand;
        fuelType = Ftype;
    }
    void displayDetails() {
        System.out.println("Vehicle number = : " + vehicleNumber);
        System.out.println("Vehical Brand name : " + Brand);
        System.out.println("Fuel type : " + fuelType);
    }
}
class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;

    public Car(String Vnumber, String Vbrand, String Ftype, int numberOfSeats, boolean ACavailable) {
        super(Vnumber, Vbrand, Ftype);
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of seats : " + numberOfSeats);
        System.out.println("AC availbles : " + (ACavailable ? "yes" : "no"));
    }
}
class ElectricCar extends Car {
    protected double batteryCapacity;
    protected double chargingTime;
    public ElectricCar(String Vnumber, String Vbrand, String Ftype, int numberOfSeats, boolean ACavailable, double batteryCapacity, double chargingTime) {
        super(Vnumber, Vbrand, Ftype, numberOfSeats, ACavailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity : " + batteryCapacity + " KWH");
        System.out.println("Charging Time : " + chargingTime + " Hours");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Vehicle but not car");
            System.out.println("2. Car");
            System.out.println("3. Electric Car");
            System.out.println("4. Upcasting/Downcasting Example");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");            
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Vehicle number: ");
                    String v1 = sc.next();
                    System.out.print("Enter brand: ");
                    String b1 = sc.next();
                    System.out.print("Enter fuel type: ");
                    String f1 = sc.next();
                    Vehicle V1 = new Vehicle(v1, b1, f1);
                    System.out.println("\nVehicle Details:");
                    V1.displayDetails();
                    break;
                case 2:
                    System.out.print("Enter Vehicle number: ");
                    String v2 = sc.next();
                    System.out.print("Enter brand: ");
                    String b2 = sc.next();
                    System.out.print("Enter fuel type: ");
                    String f2 = sc.next();
                    System.out.print("Enter number of seats: ");
                    int s2 = sc.nextInt();
                    System.out.print("Is AC available? (true/false): ");
                    boolean a2 = sc.nextBoolean();
                    Car c1 = new Car(v2, b2, f2, s2, a2);
                    System.out.println("\nCar Details:");
                    c1.displayDetails();
                    break;
                case 3:
                    System.out.print("Enter Vehicle number: ");
                    String v3 = sc.next();
                    System.out.print("Enter brand: ");
                    String b3 = sc.next();
                    System.out.print("Enter fuel type: ");
                    String f3 = sc.next();
                    System.out.print("Enter number of seats: ");
                    int s3 = sc.nextInt();
                    System.out.print("Is AC available? (true/false): ");
                    boolean a3 = sc.nextBoolean();
                    System.out.print("Enter Battery Capacity (KWH): ");
                    double bc = sc.nextDouble();
                    System.out.print("Enter Charging Time (Hours): ");
                    double ct = sc.nextDouble();
                    ElectricCar E1 = new ElectricCar(v3, b3, f3, s3, a3, bc, ct);
                    System.out.println("\nElectric Car Details:");
                    E1.displayDetails();
                    break;
                case 4:
                    System.out.println("\n===== || Upcasting Example || =====");
                    Vehicle vobj = new Car("GJ05SU1234", "BMW", "PETROL", 5, true);
                    vobj.displayDetails();
                    System.out.println("\n===== || Downcasting Example || =====");
                    if (vobj instanceof Car) {
                        Car cobj = (Car) vobj;
                        System.out.println("Accessing subclass specific seat count: " + cobj.numberOfSeats);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
        sc.close();
    }
}
