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
	
//toString
	@Override
	public String toString() {
		return "Automobile [ vehicleID = " + getVehicleID()
				+ ", monthOfSale = " + getMonthOfSale() + ", cityOfSale = " + getCityOfSale() + ", productionYear = "
				+ getProductionYear() + ", roofType = " + roofType + ", engineVolume = " + getEngineVolume() + ", vat = " + getVat() + " ]";
	}
}
