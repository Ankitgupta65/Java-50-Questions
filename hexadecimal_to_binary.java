import java.util.Scanner;
public class hexadecimal_to_binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hex = scanner.nextLine();

        // Convert hexadecimal to decimal
        int decimal = Integer.parseInt(hex, 16);

        // Convert decimal to binary
        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary representation: " + binary);

        scanner.close();
    }
}