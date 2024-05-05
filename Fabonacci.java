import java.util.*;

class Fabonacci {
    public static void main(String[] args) {
        int pp,p,c,i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any term:");
        n=sc.nextInt();
        pp=0;
        p=1;
        sc.close();
        System.out.print(pp+" "+p);
        for(i=3;i<=n;i++)
        {
            c=pp+p;
        System.out.print(" "+c);
        pp=p;
        p=c;
        }
    }
}
