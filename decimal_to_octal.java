public class decimal_to_octal {
     public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String octal = Integer.toOctalString(decimal);

        System.out.println("octal representation: " + octal);

        scanner.close();
    }
}


