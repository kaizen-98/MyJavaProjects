package VehicleSystem;

public class Main {

	public static void main(String[] args) {
	
		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		Truck truck = new Truck();
		
		 
		vehicle.setMake("Londaon");
		vehicle.setColor("Red");
		vehicle.setModel("Modern");
		vehicle.setNumberOfWheels(4);
		vehicle.setYear(1990);
		vehicle.setWeight(188);
		vehicle.Start();
		System.out.println(vehicle.getMake());
		System.out.println(vehicle.getColor());
		System.out.println(vehicle.getModel());
		System.out.println(vehicle.getNumberOfWheels());
		System.out.println(vehicle.getYear());
		System.out.println(vehicle.getWeight());
		vehicle.Stop();
		
		
	}

}
