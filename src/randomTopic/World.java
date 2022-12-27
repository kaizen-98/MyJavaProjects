package randomTopic;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class World {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		System.out.println("What is your Country?");
		String country = scan.next();
	//	while(scan.hasNextLine()) {
		//	country = country.concat(scan.nextLine());
		//}
		
		
		FileWriter write = new FileWriter("\\Users\\Lenovo\\Desktop\\Java101\\output.txt");
		write.write(country);
		write.close();

		
	}

}
