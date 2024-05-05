import java.util.*;
class Electricity
{
    public static void main(String[] args) {
        int unit,amount;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter unit ");
        unit=sc.nextInt();
        if(unit<=100)
        {
            amount=unit*5+150;
            System.out.println("amount=" +amount);
        }
        else if(unit>100 && unit<=500)
        {
            amount=100*5+(unit-100)*8+150;
            System.out.println("amount=" +amount);
        }
        else
        {
            amount=100*5+400*8+(unit-500)*10+150;
            System.out.println("amount="+amount);
        }
        sc.close();
    }
}