import java.util.Scanner;
public class binary_to_decimal {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        // user must enter a binary number
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();
        
        int decimal = Integer.parseInt(binary,2);
        System.out.println("Decimal representation:" +decimal);
        scanner.close();

    }
    
}
