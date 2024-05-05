import java.util.*;

interface A
{
    final int x = 10;
    final int y = 20;
    void display();
}
class B implements A
{
    int m,z;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        m = sc.nextInt();
    }
    void calculate()
    {
        z = x*y+m;
    }
    public void display()
    {
        System.out.println("Resut = "+z);
    }
}

public class InheritPrg {
    public static void main(String[] args) {
        B obj = new  B();
        obj.getdata();
        obj.calculate();
        obj.display();
    }
}
