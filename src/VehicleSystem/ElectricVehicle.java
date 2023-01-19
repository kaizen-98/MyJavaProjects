package VehicleSystem;

public class ElectricVehicle extends Vehicle {

	private int batteryCapacity;

	private int chargeLevel;

	public  void Charge() {

	}

	@Override
	public void Drive(int miles) {
		// TODO Auto-generated method stub
		super.Drive(miles);
		System.out.println("Vehicle driven "+miles+" miles");
	}
	

}
