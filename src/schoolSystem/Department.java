package schoolSystem;

import java.util.ArrayList;

public class Department {

	// creating object and array list
	Teacher teacher = new Teacher();
	ArrayList<Teacher> tlist = new ArrayList<Teacher>();
	private String Name;
	private int NumId;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getNumId() {
		return NumId;
	}
	public void setNumId(int numId) {
		NumId = numId;
	}
	
	
}
