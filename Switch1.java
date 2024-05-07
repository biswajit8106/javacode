import java.util.*;
public class Switch1 {
    public static void main(String args[])
    {
        int ch,a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter two numbers ");
        a=sc.nextInt();
        b=sc.nextInt();
        do
        {
          System.out.println("1. Addition");
          System.out.println("2. Subtraction");
          System.out.println("3. Multiplication");
          System.out.println("4. Division");
          System.out.println("5. Exit");
          System.out.println("Enter your choice");
          ch=sc.nextInt();
          switch(ch)
          {
            case 1:
            System.out.println("Addition="+(a+b));
            break;
            case 2:
            System.out.println("Subtraction="+(a-b));
            break;
            case 3:
            System.out.println("Multiplication="+(a*b));
            break;
            case 4:
            System.out.println("Division="+(a/b));
            break;
            case 5:
            System.exit(0);
            default:
            System.out.println("Invalid choice");
          }
        }while(ch!=5);
    }  
}
