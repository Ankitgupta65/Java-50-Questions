import java.util.Scanner;

public class basicarithmaticopr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt(); // First number from user

        System.out.print("Enter second number: ");
        int b = scanner.nextInt(); // Second number from user

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int division = a / b;
        int remainder = a % b;

        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        System.out.println("The difference of " + a + " and " + b + " is: " + difference);
        System.out.println("The product of " + a + " and " + b + " is: " + product);
        System.out.println("The division of " + a + " by " + b + " is: " + division);
        System.out.println("The remainder of " + a + " by " + b + " is: " + remainder);

        scanner.close();
    }
}