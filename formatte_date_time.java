
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class formatte_date_time {
    public static void main(String[] args) {
        // Get current date and time
        LocalDateTime now = LocalDateTime.now();

        // Define the desired format, e.g., "dd-MM-yyyy HH:mm:ss"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Format the current date and time
        String formattedDateTime = now.format(formatter);

        // Display the formatted date and time
        System.out.println("Current date and time: " + formattedDateTime);
    }
}