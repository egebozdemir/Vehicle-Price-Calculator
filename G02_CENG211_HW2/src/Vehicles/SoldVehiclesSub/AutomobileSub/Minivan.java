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
	
//toString
	@Override
	public String toString() {
		return "Automobile [ vehicleID = " + getVehicleID()
				+ ", monthOfSale = " + getMonthOfSale() + ", cityOfSale = " + getCityOfSale() + ", productionYear = "
				+ getProductionYear() + ", numberOfSeats = " + numberOfSeats + ", engineVolume = " + getEngineVolume() + ", vat = " + getVat() + " ]";
	}
}
