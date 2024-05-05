import java.util.Scanner;

public class String_Palindrom {
    public static void main(String[] args) {
        String s1 = "  ";
        String s2 = "  ";
        int l,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string ");
        s1 = sc.next();
        l = s1.length();
        for (i = l-1; i >= 0; i--)
        {
            s2 = s2+s1.charAt(i);
        }
        s2 = s2.trim();
        if (s1.compareTo(s2)==0)
        {
            System.out.println("Palindrom = "+s1);
        }
        else
        {
            System.out.println("Not Palindrom");

        }
    }
}
