import java.util.Scanner;
public class octal_to_hexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        String octal = scanner.nextLine();

        // Convert octal to decimal
        int decimal = Integer.parseInt(octal, 8);

        // Convert decimal to hexadecimal
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();

        System.out.println("Hexadecimal representation: " + hexadecimal);

        scanner.close();
    }
}
