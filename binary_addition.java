import java.util.Scanner;

public class binary_addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.print("Enter second binary number: ");
        String binary2 = scanner.nextLine();

        // Convert binary strings to decimal integers
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        // Add the numbers
        int sum = num1 + num2;

        // Convert the sum back to binary string
        String binarySum = Integer.toBinaryString(sum);

        System.out.println("Sum of " + binary1 + " and " + binary2 + " is: " + binarySum);

        scanner.close();
    }
}