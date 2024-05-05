import java.util.Scanner;

public class String_strength {
    public static void main(String[] args) {
        String s1 = "  ";
        int l ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string :  ");
        s1 = sc.next();
        l = s1.length();
        System.out.println("Length of string = "+l);
    }
}
