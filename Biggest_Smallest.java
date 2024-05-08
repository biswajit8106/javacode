import java.util.Scanner;

public class Biggest_Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = sc.nextInt();
        
        int matrix[][] = new int[rows][columns];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        
        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
        
        sc.close();
    }
}