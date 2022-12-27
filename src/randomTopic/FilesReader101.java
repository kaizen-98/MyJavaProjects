package randomTopic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesReader101 {

	public static void main(String[] args) throws IOException {
	
		
		
		File file = new File("\\Users\\Lenovo\\Desktop\\Java101\\ElonMusk.txt");
		Scanner scan = new Scanner(file);

		String txtContent ="";
		while(scan.hasNextLine()) {
			
			//System.out.println(scan.nextLine());
			txtContent = txtContent.concat(scan.nextLine() + "\n");
		}
		
		FileWriter write = new FileWriter("\\Users\\Lenovo\\Desktop\\Java101\\NewElonMusk.txt");
		write.write(txtContent);
		write.close();
		
		
	}

}
