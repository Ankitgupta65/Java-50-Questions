import java.util.Scanner;
public class average_of_three_number {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt(); // Read the first number
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt(); // Read the second number
        System.out.print("Enter the third number: ");
        int thirdNumber = scanner.nextInt(); // Read the third number

        int average = (firstNumber + secondNumber + thirdNumber) / 3; // Calculate the average

        System.out.println("The average of " + firstNumber + ", " + secondNumber + ", and " + thirdNumber + " is: " + average); // Print the average

        scanner.close(); // Close the scanner
    }}
    
    

