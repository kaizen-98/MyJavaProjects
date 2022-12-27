package randomTopic;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class World {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		ArrayList<String> country = new ArrayList<String>();
		
		for(int i =0; i<5; i++) {
			System.out.println("What is your Country?");
			country.add(scan.next()) ;
		}
		
		//while(scan.hasNextLine()) {
		//	country = country.concat(scan.nextLine());
		//}
		
		
		
		FileWriter write = new FileWriter("\\Users\\Lenovo\\Desktop\\Java101\\country.txt");
		for (String x :country) {
			write.write("\n"+x);
		}
		
		write.close();

		
	}

}
