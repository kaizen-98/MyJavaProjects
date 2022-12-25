package schoolSystem;

public class School {

	// creating object for the department 
	Department Department = new Department();
	// varibles
	private String Name;
	private int adress;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAdress() {
		return adress;
	}
	public void setAdress(int adress) {
		this.adress = adress;
	}
	
	
}
