package Vehicles.SoldVehiclesSub;

import Vehicles.*;

public class Automobile extends SoldVehicles {
	private String engineVolume;
	private String vat;
	private final int basePrice = 200000;
	
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
	
	public int getBasePrice() {
		return basePrice;
	}
	
	// Methods 
	@Override
	public double calculateTotalPrice() {
		return (basePrice) * (1 + calculateSCT() * 0.8) + (1 + Double.parseDouble(getVat()) / 100);
	}

  // toString
	@Override
	public String toString() {
		return "Automobile [ vehicleID = " + getVehicleID()
				+ ", monthOfSale = " + getMonthOfSale() + ", cityOfSale = " + getCityOfSale() + ", productionYear = "
				+ getProductionYear() + ", engineVolume = " + engineVolume + ", vat = " + vat + " ]";
	}
}
