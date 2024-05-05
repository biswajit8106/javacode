//Program to find out the sum and average of the elements present in an array.

import java.util.*;
public class SumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int average = sum / n;
        System.out.println("The sum of the elements in the array is: " + sum);
        System.out.println("The average of the elements in the array is: " + average);
        scanner.close();
    }
}
