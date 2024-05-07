import java.util.*;
public class asorting 
{
    public static void main(String[] args) 
    {
        int i,j,t,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements to be inserted");
        n=sc.nextInt();
        int Q[]=new int[n];
        System.out.println("Enter elements in array");
        for(i=0;i<n;i++)
        {
            Q[i]=sc.nextInt();
        }
        for(i=0;i<n-2;i++)
        {
            for(j=0;j<=n-2-i;j++)
        {
            if (Q[j]>Q[j+1])
             {
                t=Q[j];
                Q[j]=Q[j+1];
                Q[j+1]=t;
            }
        }
        }
        System.out.println("Array in sorted order");
        for (i=0;i<n;i++) 
        {
            System.out.println(" "+Q[i]);
        }
        
    }
}
