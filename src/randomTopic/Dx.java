package randomTopic;

import java.util.Scanner;

public class Dx {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number of Names?? ");
		int numOfName = kb.nextInt();
	
		String[] names = new String[numOfName];
	
		for(int i=0; i<numOfName; i++) {
			System.out.println("Enter The Name "+(i+1)+": ");
			names[i]= kb.next();
		}
		
		 //kb.close();
		 
		 for(int i=0; i<numOfName; i++) {
			 int count = 1;
			for(int j = i+1; j<numOfName; j++) {
				if(names[i].equals(names[j])) {
					count++;
				}
			}
			  if (count > 1) {
			        System.out.println("Name '" + names[i] + "' occurs " + count + " times.");
			      }
		 }
	
	
	
	
	
	
	
	
	
	
	}

}
