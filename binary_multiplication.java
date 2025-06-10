import java.util.Scanner;

public class binary_multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.print("Enter second binary number: ");
        String binary2 = scanner.nextLine();

        // Convert binary strings to decimal integers
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        // Multiply the numbers
        int product = num1 * num2;

        // Convert the product back to binary string
        String binaryProduct = Integer.toBinaryString(product);

        System.out.println("Product of " + binary1 + " and " + binary2 + " is: " + binaryProduct);

        scanner.close();
    }
}