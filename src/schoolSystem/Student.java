package schoolSystem;

import java.util.ArrayList;

public class Student {

	Coures coure = new Coures();
	
	private String Name;
	private int iDs;
	ArrayList<Coures> clist = new ArrayList<Coures>();
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getiDs() {
		return iDs;
	}
	public void setiDs(int iDs) {
		this.iDs = iDs;
	}
	
	
}
