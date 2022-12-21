package schoolSystem;

import java.util.ArrayList;

public class Teacher {

	Student student = new Student();
	
	private String Name;
	private int age;
	ArrayList<Student> slist = new ArrayList<Student>();
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
