import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year you want to check either it is a leap year or not");
        year=sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("it is a leap year"+year);
        }
        else
            {
                System.out.println("it is not a leap year");

            }
         sc.close();
        }
}
