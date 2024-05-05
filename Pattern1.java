import java.util.*;
class Pattern1
{
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }

    }
}