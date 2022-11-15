package Vehicles.SoldVehiclesSub.AutomobileSub;

import Vehicles.SoldVehiclesSub.*;

public class Sedan extends Automobile {
private String roofType;
	
	/* Constructors */
	// Empty
	public Sedan() {
		
	}
	
	// Full
	public Sedan(String vehicleID, String monthOfSale, String cityOfSale, String productionYear, String roofType, String engineVolume, String vat) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear, engineVolume, vat);
		this.roofType = roofType;
	}
	
	// Copy
	public Sedan(Sedan sedan) {
		super(sedan.getVehicleID(), sedan.getMonthOfSale(), sedan.getCityOfSale(), sedan.getProductionYear(), sedan.getEngineVolume(), sedan.getVat());
		this.roofType = sedan.getRoofType();
	}

	// Getter
	public String getRoofType() {
		return roofType;
	}
	
	// Methods
	private double getSctValueFromRoofType(String roof) {
		switch (roof) {
		case "regular":
			return 0.5;
		case "moonroof":
			return 0.6;
		case "sunroof":
			return 0.8;
		default:
			return -1;
		}
	}
	
	@Override
		public double calculateSCT() {
			return (Double.parseDouble(getEngineVolume()) * 0.2 * getSctValueFromRoofType(getRoofType())) / getSctValueFromProductionYear(getProductionYear());
		}
	
	//toString
	@Override
	public String toString() {
		return "Vehicle: Sedan, " + super.toString();
	}
}
