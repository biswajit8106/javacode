
public class armnum
{
    public static void main(String[] args) 
    {
       int n,sum,n1,i; 
       
       for(i=0;i<=1000;i++)
       {
        n=i;
        n1=n;
        sum=0;
       while (n!=0)
        {
            
            sum=sum+(n%10)*(n%10)*(n%10);
            n=n/10;
       }
       if (sum==n1)
        {
            System.out.println("armstrong number"+n1);
        } 
    }
   
    }
}
