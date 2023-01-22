package RandomTopic2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import randomTopic.CustomerInfo;

public class PatientInfo {

	public static void main(String[] args) {
		
		Patient patient = new 	Patient();
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to muscat private hospital\n");
		System.out.println("Enter your id");
		patient.idNumber = kb.nextInt();
		System.out.println("Write your name here?");
		patient.name = kb.next();	
		System.out.println("Write your Lastname here?");
		patient.lastName = kb.next();
		System.out.println("Write your phone here?");
		patient.PhoneNumber = kb.nextInt();
		
		try {
			FileOutputStream file = new FileOutputStream("\\Users\\Lenovo\\Desktop\\Java101\\PatInfo.txt"); 
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(patient);
			out.close();
			file.close();
			System.out.println("Serialized and Saved");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream file = new FileInputStream("\\Users\\Lenovo\\Desktop\\Java101\\PatInfo.txt"); 
			ObjectInputStream in = new ObjectInputStream(file);
			Patient object1 = (Patient) in.readObject();
			in.close();
			file.close();
			
			
			
			System.out.println(" Name "+object1.name);
			System.out.println(" lastName "+object1.lastName);
			System.out.println(" id "+object1.idNumber);
			System.out.println(" PhoneNumber "+object1.PhoneNumber);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
