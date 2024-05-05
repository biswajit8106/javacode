import java.util.*;
class SortedOrder
{
    public static void main(String[] args) 
    {
        int i,j,n,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                  t=a[i];
                  a[i]=a[j];
                  a[j]=t;
                }
            }
        }
        System.out.println("Displaying all number in sorted order:");
        for(i=0;i<a.length;i++)
        {
            System.out.print(" "+a[i]);
        }
    }
}
