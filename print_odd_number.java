public class print_odd_number {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 99; i++) {
            // Check if the number is odd
            if (i % 2 != 0) {
                // Print the odd number
                System.out.println(i);
            }
        }
    }
}
