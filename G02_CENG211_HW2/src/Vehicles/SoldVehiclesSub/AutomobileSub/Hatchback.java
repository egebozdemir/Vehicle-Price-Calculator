package Vehicles.SoldVehiclesSub.AutomobileSub;

import Vehicles.SoldVehiclesSub.*;

public class Hatchback extends Automobile {
	private String cityMode;
	
	/* Constructors */
	// Empty
	public Hatchback() {
		
	}
	
	// Full
	public Hatchback(String vehicleID, String monthOfSale, String cityOfSale, String productionYear, String cityMode, String engineVolume, String vat) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear, engineVolume, vat);
		this.cityMode = cityMode;
	}
	
	// Copy
	public Hatchback(Hatchback hatchback) {
		super(hatchback.getVehicleID(), hatchback.getMonthOfSale(), hatchback.getCityOfSale(), hatchback.getProductionYear(), hatchback.getEngineVolume(), hatchback.getVat());
		this.cityMode = hatchback.getCityMode();
	}

	// Getter
	public String getCityMode() {
		return cityMode;
	}
	
//toString
	@Override
	public String toString() {
		return "Automobile [ vehicleID = " + getVehicleID()
				+ ", monthOfSale = " + getMonthOfSale() + ", cityOfSale = " + getCityOfSale() + ", productionYear = "
				+ getProductionYear() + ", cityMode = " + cityMode + ", engineVolume = " + getEngineVolume() + ", vat = " + getVat() + " ]";
	}
}