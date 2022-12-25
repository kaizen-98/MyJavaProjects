package schoolSystem;

import java.util.ArrayList;

public class Coures {
	// creating object and array list
	Marks mark = new Marks(); 
	
	private String Name;
	private int code;
	ArrayList<Marks> mlist = new ArrayList<Marks>();
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	
}
