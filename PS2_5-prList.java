import java.util.*;
public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. of account ");
            int n = sc.nextInt();
            Bank a[] = new Bank[n];
            for(int i=0 ; i<n ; i++){                
                a[i] = new Bank();                
                System.out.println();                
                System.out.println("Enter Account detail :\nEnter AccountId = ");
                String ID = sc.next();                
                System.out.println("Enter Account Holder name = ");
                String name = sc.next();                
                System.out.println("Enter Balance = ");
                double balance = sc.nextInt();                
                a[i].assignValue(ID,name,balance);                
            }            
            System.out.println("---Account Details---");            
            for(int i=0 ; i<n ; i++){
                a[i].display();
                System.out.println();
            }            
            System.out.println("Enter Account to Search : ");
            String searchid = sc.next();
            Bank.search(a,searchid);
    }
}
class Bank{
    private String AccountID , AccountHolderName ;
    private double Balance;    
    void assignValue (String ID , String name , double balance){
        AccountID = ID;
        AccountHolderName = name;
        Balance = balance;
    }    
    void display (){        
        System.out.println("Account Id : " + AccountID);
        System.out.println("Account HOlder Name : " + AccountHolderName );
        System.out.println("Account Balane : " + Balance );
    }    
    static void search (Bank a[],String search){
        int b=0;
        for(int i=0 ; i<a.length ; i++){
            if(a[i].AccountID.equals(search)){
                System.out.println("\nAccount found : \n");
                a[i].display();
                b=1;
            }
        }
        if(b==0){
            System.out.println("Account not found ");
        }
    }
}
