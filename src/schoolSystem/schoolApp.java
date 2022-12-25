package schoolSystem;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;

public class schoolApp {

	public static void main(String[] args) {
		// here we create scanner so the user can input data
		Scanner kb = new Scanner(System.in);
		// create school object here
		School school = new School();
		// create welcome massage here
		ArrayList<Department> depList = new ArrayList<Department>();

		// the welcome massage here and school information 
		System.out.println("Welcome to our School!!");
		System.out.println("You have to enter school info\n!!");
		System.out.println("Enter the School Name?");
		String sName = kb.next();
		school.setName(sName);
		System.out.println("Enter School Adress?");
		int sAdress = kb.nextInt();
		school.setAdress(sAdress);
		System.out.println("Information Sucessfully stored!");
		System.out.println("School Name is : " + school.getName());
		System.out.println("School Adress : " + school.getAdress());
		// here we use while loop for looping 
		boolean i = true;
		while (i) {
			Department department = new Department();
			System.out.println("Now Enter the Department Name?");
			String dName = kb.next();
			department.setName(dName);
			System.out.println("Now Enter the Department iD?");
			int iD = kb.nextInt();
			department.setNumId(iD);

			boolean j = true;
			while (j) {
				Teacher teacher = new Teacher();
				System.out.println("Now Enter the Teacher Name?");
				String wName = kb.next();
				teacher.setName(wName);
				System.out.println("Now Enter the Teacher Age?");
				int wAge = kb.nextInt();
				teacher.setAge(wAge);

				
				boolean c = true;
				while (c) {
					Student student = new Student();
					System.out.println("Now Enter the Student Name?");
					String Name = kb.next();
					student.setName(Name);
					System.out.println("Now Enter the Student iD?");
					int id = kb.nextInt();
					student.setiDs(id);

					
					boolean d = true;
					while (d) {
						Coures coures = new Coures();
						System.out.println("Now Enter the Coures Name?");
						String cName = kb.next();
						coures.setName(cName);
						System.out.println("Now Enter the Coures code?");
						int code = kb.nextInt();
						coures.setCode(code);

					
						boolean e = true;
						while (e) {
							Marks mark = new Marks();
							System.out.println("Now Enter the Marks From 100%?");
							System.out.println("Math ");
							int math = kb.nextInt();
							mark.setMath(math);
							System.out.println("Arabic ");
							int arabic = kb.nextInt();
							mark.setMath(arabic);
							System.out.println("Sci ");
							int sci = kb.nextInt();
							mark.setMath(sci);

							System.out.println("Do you add more Marks? yes/no?");
							String keyyyl = kb.next();
							if (keyyyl.equals("yes")) {
								e = true;
							} else {
								e = false;
							}
							student.coure.mlist.add(mark);
						}
						student.clist.add(coures);
						System.out.println("Do you add more Coures? yes/no?");
						String keyyy = kb.next();
						if (keyyy.equals("yes")) {
							d = true;
						} else {
							d = false;
						}
					}
					teacher.slist.add(student);
					System.out.println("Do you add more Student? yes/no?");
					String keyy = kb.next();
					if (keyy.equals("yes")) {
						c = true;
					} else {
						c = false;
					}

				}
				department.tlist.add(teacher);
				System.out.println("Do you add more Teachers? yes/no?");
				String key = kb.next();
				if (key.equals("yes")) {
					j = true;

				} else {
					j = false;
				}
			}

			depList.add(department);
			System.out.println("Do you add more Department? yes/no?");
			String key = kb.next();
			if (key.equals("yes")) {
				i = true;
			} else {
				i = false;
			}

		}
		// The output of the 
		System.out.println("\n⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘");
		System.out.println("\n+++++++++++++ School Details ++++++++++++++");
		System.out.println("School Name is : " + school.getName());
		System.out.println("School Adress : " + school.getAdress());
		System.out.println("\n+++++++++++++++++++++++++++");
		for (Department d : depList) {
			System.out.println("department Name is : " + d.getName());
			System.out.println("department id : " + d.getNumId());
			System.out.println("\n+++++++++++++++++++++++++++");
			for (Teacher t : d.tlist) {
				System.out.println("Teacher Name is : " + t.getName());
				System.out.println("Age : " + t.getAge());
				System.out.println("\n+++++++++++++++++++++++++++");
				for (Student s : t.slist) {
					System.out.println("Student Name is : " + s.getName());
					System.out.println("Student id : " + s.getiDs());
					System.out.println("\n+++++++++++++++++++++++++++");
					for (Coures c : s.clist) {
						System.out.println("Coures Name is : " + c.getName());
						System.out.println("Coures code : " + c.getCode());
						System.out.println("\n+++++++++++++++++++++++++++");
						for (Marks m : c.mlist) {
							System.out.println("Math : " + m.getMath());
							System.out.println("Arabic : " + m.getArabic());
							System.out.println("Sci : " + m.getSci());
							System.out.println("+++++++++++++Done+++++++++++++++");
						}
					}
				}
			}
		}

	}

}
