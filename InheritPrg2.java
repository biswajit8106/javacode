import java.util.*;

class Student {
    int rollno;

    void getdata1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll no ");
        rollno = sc.nextInt();
    }
}

class subject extends Student{
    int sub1, sub2;

    void getdata2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject 1 and 2 ");
        sub1 = sc.nextInt();
        sub2 = sc.nextInt();
    }
}

interface sport {
    final int Sm = 10;

    void display();
}

class result extends subject implements sport {
    int total;

    void calculate() {
        total = sub1 + sub2 + Sm;
    }

    public void display() {
        System.out.println("Total marks: " + total);
    }
}

public class InheritPrg2 {
    public static void main(String[] args) {
        result obj = new result();
        obj.getdata1();
        obj.getdata2();
        obj.calculate();
        obj.display();
    }
}
