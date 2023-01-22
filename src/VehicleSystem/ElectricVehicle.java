package VehicleSystem;

public class ElectricVehicle extends Vehicle {

	private int batteryCapacity;

	private int chargeLevel;

	
	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getChargeLevel() {
		return chargeLevel;
	}

	public void setChargeLevel(int chargeLevel) {
		this.chargeLevel = chargeLevel;
	}

	public  void Charge() {

	}

	@Override
	public void Drive(int miles) {
		// TODO Auto-generated method stub
		super.Drive(miles);
		System.out.println("Vehicle driven "+miles+" miles");
	}
	

}
