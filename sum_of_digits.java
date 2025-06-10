import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
       int n = Math.abs(number);
       while(n>0) {
            sum += n % 10; // Add the last digit to sum
            n /= 10; // Remove the last digit
        }

        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }
}
