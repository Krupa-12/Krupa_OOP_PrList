import java.util.*;
public class pr7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            LoanCalculator loan = new LoanCalculator();            
            System.out.println("1. Home loan");
            System.out.println("2. vehicle loan");
            System.out.println("3. personal loan");
            System.out.println("Enter Your Choice");
            int n = sc.nextInt();            
            switch(n)
            {
                case 1:
                    System.out.println("Enter principle : ");
                    int hprinciple = sc.nextInt();
                    System.out.println("Enter time (years)  : ");
                    int htime = sc.nextInt();
                    System.out.println("Enter rate : ");
                    float hrate = sc.nextFloat();                    
                    loan.calculateEMI(hprinciple,htime,hrate);                    
                    break;                   
                case 2:
                    System.out.println("Enter principle : ");
                    int vprinciple = sc.nextInt();
                    System.out.println("Enter time (years)  : ");
                    int vtime = sc.nextInt();
                    System.out.println("Enter rate : ");
                    double vrate = sc.nextDouble();                    
                    loan.calculateEMI(vprinciple,vtime,vrate);                    
                    break;                    
                case 3:
                    System.out.println("Enter principle : ");
                    int pprinciple = sc.nextInt();
                    System.out.println("Enter time (years)  : ");
                    int ptime = sc.nextInt();                    
                    loan.calculateEMI(pprinciple,ptime);
                    break;
            }
        }
    }
}
class LoanCalculator{        
    public void calculateEMI(int principle , int time , float rate){        
        double monthlyrate = rate / (12*100);
        int months=time*12;  
        double emi = (principle * monthlyrate * Math.pow(1 + monthlyrate , months))/(Math.pow(1 + monthlyrate , months) - 1);
        System.out.println("Home Loan EMI : " + String.format("%2f",emi));        
    }    
    void calculateEMI(int principle , int time , double rate){        
        double monthlyrate = rate / (12*100);
        int months=time*12;  
        double emi = (principle * monthlyrate * Math.pow(1 + monthlyrate , months))/(Math.pow(1 + monthlyrate , months) - 1);
        System.out.println("Vehicle Loan EMI : " + String.format("%2f",emi));        
    }    
    void calculateEMI(int principle , int time ){        
        double rate = 10.0;
        double monthlyrate = rate / (12*100);
        int months=time*12;  
        double emi = (principle * monthlyrate * Math.pow(1 + monthlyrate , months))/(Math.pow(1 + monthlyrate , months) - 1);
        System.out.println("Home Loan EMI : " + String.format("%2f",emi));        
    }
}
