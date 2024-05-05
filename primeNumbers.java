import java.util.*;
public class primeNumbers 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("Prime numbers between 1 and " + n + " are:");
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && i != 1) {
                System.out.print(i + " ");
            }
        }
    }
}