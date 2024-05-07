import java.util.*;
class Pattern12
{
    public static void main(String[] args) {
        int n,i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0; j<n-i-1; j++)
            {
                System.out.print(" ");
            }
            for(k=i;k<=2*i;k++)
            {
                System.out.print(" "+k);
            }
            System.out.println();
        }

    }
}
