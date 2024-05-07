// package program without using extends and implements.

import User_define_Package.A;
import User_define_Package.B;
import java.util.*;

class C
{
    int m, z;
    private A a;
    private B b;

    public void getdata2() 
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        m = sc.nextInt();
    }

    public void calculate() 
   {
        z = a.x* B.X + m;
    }

    public void display() 
   {
        System.out.println("Result= " + z);
    }
}
public class PackagePrg3 
{
    public static void main(String[] args) 
    {
        C obj = new C();
        obj.a = new A();
        obj.b = new B();
        obj.a.getdata1();
        obj.getdata2();
        obj.calculate();
        obj.display();
    }
}
