import java.util.*;
public class sumofdigit 
{
    public static void main(String[] args) {
        int n,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        while (n>9) 
        {
            sum=0;
            while (n!=0) 
            {
                sum = sum + n%10;
                n=n/10;
            }
            n=sum;
        }
        System.out.println("result=" +n);
        sc.close();
    }
}
