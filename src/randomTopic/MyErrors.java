package randomTopic;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyErrors {

	public static void main(String[] args) throws IOException {

		Scanner kb = new Scanner(System.in);
		System.out.println("#######Welcome to our program##########\n");
		System.out.println("You have diffrenet type of Calculation + / * and -");
		try {
			System.out.println("Enter your frist number");
			int a = kb.nextInt();
			System.out.println("Enter your second number");
			int b = kb.nextInt();
			System.out.println("Choose a opreter");
			String i = kb.next();
			switch (i) {
			case "+":
				int x = a +b;
				System.out.println("The result of sum "+x);
				break;
			case "*":
				x = a *b;
				System.out.println("The result of multpcation "+x);
				break;
			case "/":
				x = a /b;
				System.out.println("The result of divide "+x);
				break;
			case "-":
				x = a /b;
				System.out.println("The result of subtraion "+x);
				break;
			}
		} catch (Exception e) {
			System.out.println("You made a mistake!!");
		}
	
		System.out.println("Do you wannna a copy of your reslut? press yes");
		String z = kb.next();
		if(z.equals("yes")) {
			FileWriter write = new FileWriter("\\Users\\Lenovo\\Desktop\\Java101\\reuslt.txt");
			write.write(z);
			System.out.println("your reuslt saved on this path \\\\Users\\\\Lenovo\\\\Desktop\\\\Java101\\\\reuslt.txt");
		}
		
		
		//finally {
		//	System.out.println("The End of the programm!!");
	//	}
		
	}

}
