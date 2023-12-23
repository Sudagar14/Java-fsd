package program_one;
import java.util.Scanner;

public class Problem_Statement_2 {

	    public static void main(String[] args) {
	        // Array of email IDs
	        String[] emailArray = {
	            "john.doe@example.com",
	            "jane.smith@example.com",
	            "bob.jones@example.com",
	            // Add more email IDs as needed
	        };

	        // Prompt the user to enter an email ID
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the email ID to search: ");
	        String userInput = scanner.nextLine();

	        // Search for the entered email ID in the array
	        boolean found = false;
	        for (String email : emailArray) {
	            if (email.equals(userInput)) {
	                found = true;
	                break;
	            }
	        }

	        // Display the result
	        if (found) {
	            System.out.println("Email ID found in the array.");
	        } else {
	            System.out.println("Email ID not found in the array.");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}



