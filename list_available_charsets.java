import java.nio.charset.Charset;
import java.util.SortedMap;

public class list_available_charsets {
    public static void main(String[] args) {
        // Get all available character sets
        SortedMap<String, Charset> charsets = Charset.availableCharsets();

        // Print each character set name
        for (String charsetName : charsets.keySet()) {
            System.out.println(charsetName);
        }
    }
}