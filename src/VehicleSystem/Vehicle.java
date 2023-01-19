package VehicleSystem;

public class Vehicle {

	

	private	String make;
	private	String model;
	private	String color;
	private	int year;
	private	int numberOfWheels;
	private	int weight;



	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public static void Start() {
		System.out.println("Vehicle started!");

	}

	public static void Stop() {
		System.out.println("Vehicle stopped!");

	}

	public static void Drive(int miles) {
		System.out.println("Vehicle driven "+miles+" miles");

	}

	public static void Honk() {
		System.out.println("Honk Honk!");

	}
}
