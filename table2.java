import java.util.*;
public class table2 {
    public static void main(String[] args) {
        int i,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to form a table");
        n=sc.nextInt();
        i=1;
        while (i<=10) {
            System.out.println(n+"*"+i+"="+n*i);
            i++;
            sc.close();
        }
    }
}
