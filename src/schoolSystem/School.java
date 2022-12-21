package schoolSystem;

public class School {

	
	Department Department = new Department();
	
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
