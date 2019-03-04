/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
import java.util.Arrays;

/**
 * This program will allow users to enter in their name and favourite genre 
 * from a given list and then create a new user profile for them using their 
 * inputs.
 * @author tta
 */
public class TestUserprofile {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        // Instantiates a new profile for the user with blank inputs.
        UserProfile newProfile = new UserProfile("", "");
        
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Enter your favourite genre from this list: " 
                + Arrays.toString(newProfile.getGenres()));
        String genre = in.nextLine();
        
        // Sets their name and favourite genre from their inputs.
        newProfile.setUserID(name);
        newProfile.setGenre(genre);
        
        // Displays a message stating their account is created and displays 
        // their inputs.
        System.out.println("Your profile has been created.\n Your name is: " 
                + newProfile.getUserID() + "\nYour favourite genre is: " 
                + newProfile.getGenre());
        
    }
    
}
