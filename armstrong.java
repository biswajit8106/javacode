import java.util.*;
public class armstrong 
{
    public static void main(String[] args) 
    {
       int n,sum=0,n1; 
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter any number");
       n=sc.nextInt();
       n1=n;
       while (n!=0)
        {
            sum=sum+(n%10)*(n%10)*(n%10);
            n=n/10;
       }
       if (sum==n1)
        {
            System.out.println("armstrong number"+n1);
        }
        else
        {
            System.out.println("not armstrom number"+n1);
        }
        sc.close();
    }
}
