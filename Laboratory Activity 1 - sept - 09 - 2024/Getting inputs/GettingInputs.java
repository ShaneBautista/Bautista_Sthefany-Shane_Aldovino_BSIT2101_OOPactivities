import java.util.Scanner;

public class GettingInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get inputs from the user
        System.out.print("Enter the year: ");
        int year = scanner.nextInt(); // Integer input
        
        // Consume the newline character after nextInt
        scanner.nextLine();
        
        System.out.print("Enter the genre: ");
        String genre = scanner.nextLine(); // String input
        
        System.out.print("Enter the album: ");
        String album = scanner.nextLine(); // String input
        
        System.out.print("Enter the song title: ");
        String title = scanner.nextLine(); // String input
        
        System.out.print("Enter the artist: ");
        String artist = scanner.nextLine(); // String input
        
        // Print the song details
        System.out.println("\n------------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("------------------------------");
        System.out.println("Year Released: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Title: \"" + title + "\"");
        System.out.println("Artist: " + artist);
    }
}
