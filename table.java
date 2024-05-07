import java.util.*;
/**
 * table
 */
public class table {

    public static void main(String[] args) {
        int n,i;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        i=1;
        while (i<=10) {
            System.out.println("table="+n*i);
            i++;
            sc.close();
        }
    }
}