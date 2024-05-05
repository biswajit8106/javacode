// Program to sort an array in an ascending order.

import java.util.*;
public class sortarray {
    public static void main(String[] args) 
    {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter the elements:");
        for ( i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        for ( i = 0; i < arr.length; i++) 
        {
            for (j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for ( i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}