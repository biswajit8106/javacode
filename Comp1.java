import java.util.*;
class Comp
{
    void getdata()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real and imagenari number:");
        int r = sc.nextInt();
        int i = sc.nextInt();
        sc.close();
    }
    void sum (Comp c2)
    {
        int r=r+c2.r;
        int i=i+c2.i;
    }
    void display()
    {
        System.out.println("Real no.= "+r);
        System.out.println("Imagenari no.= "+i);
    }
}
class Comp1
{
    public static void main(String[] args) 
    {
        Comp c1=new Comp();
        Comp c2=new Comp();
        c1.getdata();
        c2.getdata();
        c1.sum(c2);
        c1.display();
    }
}