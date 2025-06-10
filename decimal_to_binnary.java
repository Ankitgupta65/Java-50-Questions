import java.util.Scanner;
public class decimal_to_binnary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary representation: " + binary);

        scanner.close();
    }
}

