import java.util.*;
class Factorial
{
    public static void main(String[] args) {
        int n,i,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        n=sc.nextInt();
        f=1;
        i=1;
        while(i<=n)
        {
          f=f*i;
          i++;
        }
        System.out.println("Factorial="+f);
        sc.close();
    }
}