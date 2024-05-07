import java.util.*;

class Comp {
    int r; // declaring instance variables
    int i;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real and imaginary number:");
        r = sc.nextInt(); // assigning values to instance variables
        i = sc.nextInt();
    }

    void sum(Comp c2) {
        r = r + c2.r; // accessing instance variables
        i = i + c2.i;
    }

    void display() {
        System.out.println("Real no.= " + r);
        System.out.println("Imaginary no.= " + i);
    }
}

class Comp1 {
    public static void main(String[] args) {
        Comp c1 = new Comp();
        Comp c2 = new Comp();
        c1.getdata();
        c2.getdata();
        c1.sum(c2);
        c1.display();
    }
}
