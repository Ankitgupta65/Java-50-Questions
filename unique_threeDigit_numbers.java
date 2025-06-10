
    public class unique_threeDigit_numbers {
    public static void main(String[] args) {
        int count = 0;
        // Loop for hundreds place
        for (int i = 1; i <= 4; i++) {
            // Loop for tens place
            for (int j = 1; j <= 4; j++) {
                // Loop for units place
                for (int k = 1; k <= 4; k++) {
                    // All digits must be different
                    if (i != j && i != k && j != k) {
                        System.out.println(i + "" + j + "" + k);
                        count++;
                    }
                }
            }
        }
        System.out.println("Total unique three-digit numbers: " + count);
    }
}
    

