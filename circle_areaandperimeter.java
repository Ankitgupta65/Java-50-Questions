import java.util.Scanner;
public class circle_areaandperimeter {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius; // Calculate the area of the circle
        double perimeter = 2* Math.PI * radius; // calculate the perimeter of the radius
        System.out.println("Area of the circle is:"+ area); // print the area of the circle
        System.out.println("Perimeter of the circle is:"+ perimeter); // print the perimeter of the circle

        scanner.close();



    }
        

    }


