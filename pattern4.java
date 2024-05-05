public class pattern4 
{
    public static void main(String[] args)
   {
       int i,lc,rc,sp,m;
       m=1;
       for (i= 5; i>=1;i--)
       {
        for(lc=1;lc<=i;lc++)
        {
            System.out.print(" "+lc);
        }
        for(sp=1;sp<m;sp++)
        {
            System.out.print(" ");
        }
        for(rc=i;rc>=1;rc--)
        {
            System.out.print(" "+rc);
        }
        m=m+4;
        System.out.println();

       }


m=m-4;
       for (i= 1; i<=5;i++)
       {
        for(lc=1;lc<=i;lc++)
        {
            System.out.print(" "+lc);
        }
        for(sp=1;sp<m;sp++)
        {
            System.out.print(" ");
        }
        for(rc=i;rc>=1;rc--)
        {
            System.out.print(" "+rc);
        }
        m=m-4;
        System.out.println();

       }




        
       








    }
}
