public class decimal_to_hexadecimal {
    
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String hexadecimal = Integer.toHexString(decimal).toUpperCase();

        System.out.println("Hexadecimal representation: " + hexadecimal);

        scanner.close();
    }
}
