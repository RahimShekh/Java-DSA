import java.util.Scanner;

public class program48 {
    
    // Method to display ASCII values in Decimal, Octal, and Hexadecimal formats
    public static void Display(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            // Print the ASCII values in decimal, octal, and hexadecimal formats
            System.out.println("Decimal    : " + (int)ch);
            System.out.println("Octal      : " + Integer.toOctalString(ch));
            System.out.println("Hexadecimal: 0X" + Integer.toHexString(ch).toUpperCase());
        } else {
            System.out.println("Please enter an alphabetic character.");
        }
    }

    public static void main(String[] args) {
        // Create Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a character
        System.out.println("Enter the character:");
        char cValue = scanner.next().charAt(0);  // Take the first character from input
        
        // Call the Display function to show ASCII values
        Display(cValue);
        
        // Close the scanner
        scanner.close();
    }
}
