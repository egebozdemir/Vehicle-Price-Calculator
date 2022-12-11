package Vehicles.SoldVehiclesSub;

import Vehicles.*;

public class Automobile extends SoldVehicles {
	private String engineVolume;
	private String vat;
	private final int BASE_PRICE = 200000;
	
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
		return BASE_PRICE;
	}
	
	// Methods 
	@Override
	public double calculateTotalPrice() {
		return (BASE_PRICE) * (1 + calculateSCT() * 0.8) + (1 + Double.parseDouble(getVat()) / 100);
	}

  // toString method is not overriden here because it has no difference from its super.toString() method
}