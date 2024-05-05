import java.util.*;

class Switch
{
    public static void main(String args[])
    {
        int choice,A,num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num1 :");
        num1 = sc.nextInt();
        System.out.println("Enter the value of num2 :");
        num2 = sc.nextInt();
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        System.out.println("5. Exist ");
        System.out.print("Enter your choice :");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                A = num1+num2;
                System.out.println("Addition ="+A);
                break;
    
            case 2:
                A = num1-num2;
                System.out.println("Subtraction "+A);
                break;
 
            case 3:
                A = num1*num2;
                System.out.println("Multiplication = "+A);
                break;
     
            case 4:
                A = num1/num2;
                System.out.println("Division = "+A);
                break;
            
            default:
                System.out.println("Invailaid input ");
        }
        sc.close();
    }
  }