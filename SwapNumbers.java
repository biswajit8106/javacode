// Program to swap two numbers without using third variable.

import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        int n1, n2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any two number:");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        System.out.println("Before swapping:");
        System.out.println("First number: " + n1);
        System.out.println("Second number: " + n2);
// Swapping the numbers
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("After swapping:");
        System.out.println("First number: " + n1);
        System.out.println("Second number: " + n2);
        scanner.close();
    }
}