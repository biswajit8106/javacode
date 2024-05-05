import java.util.*;

interface A {
    final int x = 20;
    void display();
}

class B {
    int y;

    void getdata1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        y = sc.nextInt();
    }
}

class C extends B implements A {
    int m, z;

    void getdata2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        m = sc.nextInt();
    }

    void calculate() {
        z = A.x * y + m; 
    }

    public void display() {
        System.out.println("Result = " + z);
    }
}

public class InheritPrg1 {
    public static void main(String[] args) {
        C obj = new C(); 
        obj.getdata1();
        obj.getdata2();
        obj.calculate();
        obj.display();
    }
}
