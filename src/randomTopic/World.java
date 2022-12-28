package randomTopic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class World {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		ArrayList<String> country = new ArrayList<String>();

		for (int i = 0; i < 6; i++) {
			System.out.println("What is your Country?");
			country.add(scan.next());
		}

		// this to create file and put the output inside
		FileWriter write = new FileWriter("\\Users\\Lenovo\\Desktop\\Java101\\country.txt");
		for (String x : country) {
			write.write("\n" + x);
		}
		write.close();

		BufferedReader br = new BufferedReader(new FileReader("\\Users\\Lenovo\\Desktop\\Java101\\country.txt"));
		int count = 0;
		System.out.println("Which Contry you wannna seach about?");
		String word = scan.next();
		String s;
		while((s=br.readLine())!=null) {
			if(s.equals(word)) {
				 count++;
			}
		}
		
		if(count!=0) {
			System.out.println("Number of country here that you seach "+count);
		}
		else {
			System.out.println("We couldnt find it");
		}
	}
}
