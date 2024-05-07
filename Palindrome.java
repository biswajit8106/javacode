import java.util.*;
public class Palindrome
{
    public static void main(String[] args) 
    {
        int n,n1,r=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        n = sc.nextInt();
        n1 = n;
        while(n!=0)
        {
            r=r*10+n%10;
            n=n/10;
        }
        if(r==n1)
        {
            System.out.println("Palindrom Number ="+n1);
        }
        else
        {
            System.out.println("Not a Palindrom Number"+n1);
        }
        sc.close();
    }
}
