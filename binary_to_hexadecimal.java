import java.util.Scanner;
public class binary_to_hexadecimal {
    
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a binary number:");
    String binary = scanner.nextLine();
    // Convert binary to decimal
    int decimal = Integer.parseInt(binary, 2);
    // Convert decimal to hexadecimal
    String hexadecimal = Integer.toHexString(decimal).toUpperCase();
    System.out.println("Hexadecimal representation: " + hexadecimal);
        scanner.close();
    }}



