import java.util.Scanner;

public class hexagon_area {
 public static void main(String[] args){
  Scanner scanner = new Scanner (System.in); 
  System.out.print("Enter the length of a side of  the hexagon: ");
  double side =scanner.nextDouble();


  // area of hexagon formula                            
    double area = (3 * Math.sqrt(3) / 2)* side * side;
    System.out.println("Area of hexgon:" + area);
    scanner.close();
 }
}


