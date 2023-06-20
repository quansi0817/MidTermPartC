
    import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the list of possible genres
        String[] genres = {"Action", "Adventure", "Comedy", "Drama", "Fantasy", "Horror", "Mystery", "Romance", "Sci-fi"};
        System.out.println("Select your favorite genre:");

        // Print the list of genres
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        // Get user input for name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Get user input for genre choice
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int genreChoice = scanner.nextInt();

        // Validate the genre choice
        if (genreChoice < 1 || genreChoice > genres.length) {
            System.out.println("Invalid genre choice!");
        } else {
            // Create the user profile
            String favoriteGenre = genres[genreChoice - 1];
            UserProfile userProfile = new UserProfile(name, favoriteGenre);

            // Display the profile creation message
            System.out.println("User profile created!");
            System.out.println("Name: " + userProfile.getName());
            System.out.println("Favorite Genre: " + userProfile.getFavoriteGenre());
        }
    }
}