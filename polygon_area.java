import java.util.Scanner;
// This program calculates the area of a polygon given the number of sides and the length of each side.
public class polygon_area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // inputting the number of sides in the polygon
        System.out.print(" Enter the number of sides in the polygon:");
        int n = scanner.nextInt();

        // now entering the length of the one side of the polygon
        System.out.print(" Enter the lenth of the one side:");
        double side = scanner.nextDouble();
        // now formula of the area of the regular polygon
        double area =(n*side*side) / (4* Math.tan(Math.PI / n));
        System.out.println("Area of the polygon:" +area);
        scanner.close();
    }
    
}
