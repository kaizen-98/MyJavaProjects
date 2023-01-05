package randomTopic;

import java.util.Scanner;

public class MyBest {

	public static void main(String[] args) {
		  // Create a Scanner to read input from the user
	    Scanner scanner = new Scanner(System.in);

	    // Prompt the user to enter the number of strings
	    System.out.print("Enter the number of Names: ");
	    int numStrings = scanner.nextInt();

	    // Create an array to store the strings
	    String[] strings = new String[numStrings];

	    // Read the strings from the user
	    for (int i = 0; i < numStrings; i++) {
	      System.out.print("Enter Name " + (i + 1) + ": ");
	      strings[i] = scanner.next();
	    }

	    // Close the scanner
	    scanner.close();

	    // Iterate through the array and count the number of occurrences of each string
	    for (int i = 0; i < numStrings; i++) {
	      int count = 1;
	      for (int j = i + 1; j < numStrings; j++) {
	        if (strings[i].equals(strings[j])) {
	          count++;
	        }
	      }
	      // If the count is greater than 1, the string is a duplicate
	      if (count > 1) {
	        System.out.println("Name '" + strings[i] + "' occurs " + count + " times.");
	      }
	    }
	}

}
