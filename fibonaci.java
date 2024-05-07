import java.util.*;
public class fibonaci {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int pp,p,n,c,i;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of term");
        n=sc.nextInt();
        pp=0;
        p=1;
        System.out.println(pp+" "+p);
        for(i=3;i<=n;i++)
        {
            c=pp+p;
            System.out.println(""+c);
            pp=p;
            p=c;
            sc.close();
        }
    }
}
