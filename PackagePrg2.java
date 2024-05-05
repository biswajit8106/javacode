
import User_define_Package.A;
import User_define_Package.B;
import java.util.*;

class C extends A implements B
{
      int m,z;
      void getdata2()
      {
             Scanner sc = new Scanner (System.in);
             System.out.println("Enter any number");
             m = sc.nextInt();
      }
      void calculate()
      {
            z = x * y + m;
      }
      public void display ()
      {
            System.out.println("Result= "+z);
      }
}
public class PackagePrg2
{
     public static void main(String args[])
     {
           C obj = new C();
           obj.getdata1();
           obj.getdata2();
           obj.calculate();
           obj.display();
      }
}