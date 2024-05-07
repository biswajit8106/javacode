import java.util.*;
public class swapping 
{
    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two num");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Number before swapping="+x+" "+y);
        x=x*y;
        y=x/y;
        x=x/y;
        System.out.println("Number after swapping "+x+" "+y);
    }
}
