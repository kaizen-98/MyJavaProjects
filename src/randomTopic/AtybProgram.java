package randomTopic;

import java.util.Scanner;

public class AtybProgram {

	public static void main(String[] args) {
		
		int[] numbers = {2,3,4,5,1,7,10};
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your target?");
		int x = kb.nextInt();
		
		for(int i=0; i<numbers.length; i++) {
			
			
			for (int j =i+1; j<numbers.length; j++) {
				if(numbers[i]+ numbers[j]==x) {
					System.out.println("Frist number "+numbers[i]+" add seconed number "+numbers[j]+" add up to "+x);
				}
			}
		}
		  
		
	}

}
