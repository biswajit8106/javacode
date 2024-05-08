//Program to find out the sum and average of the elements present in an array.

import java.util.*;
public class SumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n,i,avg,sum = 0;
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for ( i = 0; i < n; i++) {
            sum += a[i];
        }
         avg = sum / n;
        System.out.println("sum the array is: " + sum);
        System.out.println("average of the array is: " + avg);
        sc.close();
    }
}
