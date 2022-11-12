package Vehicles.SoldVehiclesSub;

import Vehicles.*;

public class Automobile extends SoldVehicles {
	private String engineVolume;
	private String vat;
	
	/* Constructors */
	//Empty
	public Automobile() {
		
	}
	
	// Full
	public Automobile(String vehicleID, String monthOfSale, String cityOfSale, String productionYear, String engineVolume, String vat) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear);
		this.engineVolume = engineVolume;
		this.vat = vat;
	}
	
	// Copy
	public Automobile(Automobile automobile) {
		super(automobile.getVehicleID(), automobile.getMonthOfSale(), automobile.getCityOfSale(), automobile.getProductionYear());
		this.engineVolume = automobile.getEngineVolume();
		this.vat = automobile.getVat();
	}

	// Getters
	public String getEngineVolume() {
		return engineVolume;
	}

	public String getVat() {
		return vat;
	}

  // toString
	@Override
	public String toString() {
		return "Automobile [ vehicleID = " + getVehicleID()
				+ ", monthOfSale = " + getMonthOfSale() + ", cityOfSale = " + getCityOfSale() + ", productionYear = "
				+ getProductionYear() + ", engineVolume = " + engineVolume + ", vat = " + vat + " ]";
	}
}
