public class check_even_odd {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is even or odd
            if (i % 2 == 0) {
                // Print the even number
                System.out.println(i + " is even");
            } else {
                // Print the odd number
                System.out.println(i + " is odd");
            }
        }
    }   
}
