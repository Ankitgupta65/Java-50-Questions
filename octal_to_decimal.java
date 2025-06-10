import java.util.Scanner;
public class octal_to_decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        String octal = scanner.nextLine();

        // Convert octal to decimal
        int decimal = Integer.parseInt(octal, 8);

        System.out.println("Decimal representation: " + decimal);

        scanner.close();
    }
}
