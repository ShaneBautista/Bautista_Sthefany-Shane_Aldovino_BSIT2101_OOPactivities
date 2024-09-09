import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        // Getting the first character input and extracting the first character
        System.out.println("Getting The Greater Value");
        System.out.print("Enter first character: ");
        char firstChar = scanner.next().charAt(0);

        // Getting the second character input and extracting the first character
        System.out.print("Enter second character: ");
        char secondChar = scanner.next().charAt(0);

        // Determining which character has the greater ASCII value
        char greaterChar = (char) Math.max(firstChar, secondChar);

        // Printing the character with the greater value
        System.out.println("\n------------------------------------");
        System.out.println("The character with greater value is: " + greaterChar);
        System.out.println("------------------------------------");

        // Showing the ASCII codes of both characters
        System.out.println("Showing the ASCII Codes");
        System.out.println(firstChar + " : " + (int) firstChar);
        System.out.println(secondChar + " : " + (int) secondChar);
    }
}

