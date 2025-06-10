
import java.util.Scanner;

public class distance_between_two_points {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input latitude and longitude for point 1
        System.out.print("Enter latitude of point 1 (1:25): ");
        double lat1 = Math.toRadians(scanner.nextDouble());
        System.out.print("Enter longitude of point 1 (1:35): ");
        double lon1 = Math.toRadians(scanner.nextDouble());

        // Input latitude and longitude for point 2
        System.out.print("Enter latitude of point 2 (2:35.5): ");
        double lat2 = Math.toRadians(scanner.nextDouble());
        System.out.print("Enter longitude of point 2 (2:25.51): ");
        double lon2 = Math.toRadians(scanner.nextDouble());

        // Radius of Earth in kilometers
        double R = 6371.01;

        // Haversine formula
        double distance = R * Math.acos(
            Math.sin(lat1) * Math.sin(lat2) +
            Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2)
        );

        System.out.println("Distance between the two points: " + distance + " km");

        scanner.close();
    }
}