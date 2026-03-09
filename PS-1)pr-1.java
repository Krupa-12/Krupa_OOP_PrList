import java.util.*;
public class pr1 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int[] notes={100,50,10,5,2,1};
  System.out.println("enter the amount:");
  int amount = sc.nextInt();
  for(int note:notes){
    int count=amount/note;
    amount=amount%note;
    System.out.println("note of"+note+":number of note:"+count);
  }
  }
}