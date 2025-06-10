public class reverse_a_string {
    
    public static void main(String[] args) {
        String input = "MECON,LIMITED!";
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
