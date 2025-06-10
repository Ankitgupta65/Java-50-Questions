import java.util.Scanner;
public class hexadecimal_to_decimal {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hexadecimal = scanner.nextLine();

        // Convert hexadecimal to decimal
        int decimal = Integer.parseInt(hexadecimal, 16);

        System.out.println("Decimal representation: " + decimal);

        scanner.close();
    }
}
