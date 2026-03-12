import java.util.*;
public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter time t1 = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter time t2 = ");
        int x = sc.nextInt();
        int y = sc.nextInt();        
        Time t1 = new Time();
        Time t2 = new Time();        
        Time t3 = new Time();        
        t1.setTime(a,b);
        t2.setTime(x,y);        
        t3.addTime(t1, t2);        
        t3.displayTime();
    }
}
class Time{
    private int hours,minutes;    
    void setTime(int h , int m){
        hours=h;
        minutes=m;
    }    
    void displayTime(){
        System.out.println("Time = " + hours + ":" + minutes);
    }    
    void addTime(Time t1,Time t2){        
        hours = t1.hours + t2.hours;
        minutes = t1.minutes + t2.minutes;        
        if(minutes >= 60){
            hours += (minutes/60);
            minutes %= 60;
        }
    }
}
