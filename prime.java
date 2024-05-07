import java.util.*;
public class prime {

	public static void main(String[] args) 
	{
		int i, j,n, count; 
		
		System.out.println(" enter positive integers ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();	
		for(i = 1; i <= n; i++)
		{
			count = 0;
		    for (j = 2; j <= i/2; j++)
		    {
		    	if(i % j == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
        
		    if(count == 0 && i != 1 )
		    {
		    	System.out.println(" prime number"+i);
		    }
        }    
		
	}
}
    
