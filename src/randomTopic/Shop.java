package randomTopic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {

		CustomerInfo customerInfo = new CustomerInfo();
		Scanner kb = new Scanner(System.in);
		System.out.println("Write your name?");
		customerInfo.Name = kb.next();
		System.out.println("Write your lastname?");
		customerInfo.lastName = kb.next();
		System.out.println("Write your age?");
		customerInfo.age = kb.nextInt();
		System.out.println("Write your iD?");
		customerInfo.iD = kb.nextInt();

		try {
			FileOutputStream file = new FileOutputStream("\\Users\\Lenovo\\Desktop\\Java101\\CusInfo.txt"); 
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(customerInfo);
			out.close();
			file.close();
			System.out.println("Serialized and Saved");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream file = new FileInputStream("\\Users\\Lenovo\\Desktop\\Java101\\CusInfo.txt"); 
			ObjectInputStream in = new ObjectInputStream(file);
			CustomerInfo object1 = (CustomerInfo) in.readObject();
			in.close();
			file.close();
			
			
			
			System.out.println(" Name "+object1.Name);
			System.out.println(" lastName "+object1.lastName);
			System.out.println(" age "+object1.age);
			System.out.println(" id "+object1.iD);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
