public class hexadecimal_to_octal {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hex = scanner.nextLine();

        // Convert hexadecimal to decimal
        int decimal = Integer.parseInt(hex, 16);

        // Convert decimal to octal
        String octal = Integer.toOctalString(decimal);

        System.out.println("Octal representation: " + octal);

        scanner.close();
    }   
}
