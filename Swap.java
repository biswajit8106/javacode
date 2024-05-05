import java.util.*;
class Swap
{
    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        x=sc.nextInt();
        System.out.println("Enter 2nd number:");
        y=sc.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After Sawpping:");
        System.out.println(x);
        System.out.println(y);
        sc.close();
    }
}