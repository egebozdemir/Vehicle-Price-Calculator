package Vehicles.SoldVehiclesSub.AutomobileSub;

import Vehicles.SoldVehiclesSub.*;

public class Minivan extends Automobile {
private String numberOfSeats;
	
	/* Constructors */
	// Empty
	public Minivan() {
		
	}
	
	// Full
	public Minivan(String vehicleID, String monthOfSale, String cityOfSale, String productionYear, String numberOfSeats, String engineVolume, String vat) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear, engineVolume, vat);
		this.numberOfSeats = numberOfSeats;
	}
	
	// Copy
	public Minivan(Minivan minivan) {
		super(minivan.getVehicleID(), minivan.getMonthOfSale(), minivan.getCityOfSale(), minivan.getProductionYear(), minivan.getEngineVolume(), minivan.getVat());
		this.numberOfSeats = minivan.getNumberOfSeats();
	}

	// Getter
	public String getNumberOfSeats() {
		return numberOfSeats;
	}
	
	// Methods
	private double getSctValueFromNumberOfSeats(String seat) {
		int intSeat = Integer.parseInt(seat);
		switch (intSeat) {
		case 4:
			return 0.1;
		case 5:
			return 0.4;
		case 6:
			return 0.6;
		case 7:
			return 0.8;
		default:
			return -1;
		}
	}
	
	@Override
		public double calculateSCT() {
			return (0.6 * getSctValueFromProductionYear(getProductionYear())) / (Double.parseDouble(getEngineVolume()) + getSctValueFromNumberOfSeats(getNumberOfSeats()));
		}
	
	// toString
	@Override
	public String toString() {
		return "Vehicle: Minivan, " + super.toString();
	}
}
