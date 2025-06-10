public class divisibl_by_numbers{
    public static void main(String[] args) {
        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is divisible by 3
            if (i % 3 == 0 && i % 5 != 0) {
                // Print the number if it is divisible by 3 but not by 5
                System.out.println(i + " is divisible by 3");
            } else if (i % 5 == 0 && i % 3 != 0) {
                // Print the number if it is divisible by 5 but not by 3
                System.out.println(i + " is divisible by 5");
            } else if (i % 3 == 0 && i % 5 == 0) {
                // Print the number if it is divisible by both 3 and 5
                System.out.println(i + " is divisible by both 3 and 5");
            }
        }
    }
}
