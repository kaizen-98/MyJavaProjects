package randomTopic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesReader101 {

	public static void main(String[] args) throws IOException {
	
		
		// this code to read txt from already exiting file created by the user 
		File file = new File("\\Users\\Lenovo\\Desktop\\Java101\\ElonMusk.txt");
		Scanner scan = new Scanner(file);

		String txtContent ="";
		while(scan.hasNextLine()) {
			
			//System.out.println(scan.nextLine());
			txtContent = txtContent.concat(scan.nextLine() + "\n");
		}
		
	
		// this to ctreated a file
		FileWriter write = new FileWriter("\\Users\\Lenovo\\Desktop\\Java101\\NewElonMusk.pdf");
		write.write(txtContent);
		write.close();
		
		
	}

}
