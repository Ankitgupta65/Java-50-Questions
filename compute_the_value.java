import java.util.Scanner;

public class compute_the_value{
    public static void main(String[] args) {
       try(Scanner scanner = new Scanner(System.in)){

            // Input number
            System.out.print("Input number: ");
            int n = scanner.nextInt();

            // Create nn and nnn using string concatenation
            String nStr = Integer.toString(n);
            int nn = Integer.parseInt(nStr + nStr);
            int nnn = Integer.parseInt(nStr + nStr + nStr);

            // Compute and print result
            int result = n + nn + nnn;
            System.out.println(n + " + " + nn + " + " + nnn + " = " + result);
        }
    }
}
