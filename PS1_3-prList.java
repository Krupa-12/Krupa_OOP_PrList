public class pr3{
  public static void main(String[] args)
  {
    if(args.length!=2)
    {
    System.out.println("enter two numbers:");
    return;
    }
  int a=Integer.parseInt(args[0]);
  int b=Integer.parseInt(args[1]);
  int s=a+b;
    System.out.println("sum:"+s);
  }
}
