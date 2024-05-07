import java.util.Scanner;

public class TwoDArrayAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,r,c;

    
        System.out.println("Enter the dimensions of the arrays (rows columns):");
        r = sc.nextInt();
         c = sc.nextInt();

        
        int[][] arr1 = new int[r][c];
        System.out.println("Enter elements for the first array:");
        for ( i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        int[][] arr2 = new int[r][c];
        System.out.println("Enter elements for the second array:");
        for ( i = 0; i < r; i++) {
            for ( j = 0; j < c; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        int[][] sum = new int[r][c];
        for ( i = 0; i < r; i++) {
            for ( j = 0; j < c; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Sum of the arrays:");
        for ( i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

