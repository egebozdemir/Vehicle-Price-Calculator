package Vehicles;

public class SoldVehicles {
	private String vehicleID;
	private String monthOfSale;
	private String cityOfSale;
	private String productionYear;
	
	/* Constructors */
	// Empty
	public SoldVehicles() {
		
	}
	
	// Full-Arg
	public SoldVehicles(String vehicleID, String monthOfSale, String cityOfSale, String productionYear) {
		this.vehicleID = vehicleID;
		this.monthOfSale = monthOfSale;
		this.cityOfSale = cityOfSale;
		this.productionYear = productionYear;
	}
	
	// Copy
	public SoldVehicles(SoldVehicles soldVehicle) {
		this.vehicleID = soldVehicle.getVehicleID();
		this.monthOfSale = soldVehicle.getMonthOfSale();
		this.cityOfSale = soldVehicle.getCityOfSale();
		this.productionYear = soldVehicle.getProductionYear();
	}

	// Getters
	public String getVehicleID() {
		return vehicleID;
	}

	public String getMonthOfSale() {
		return monthOfSale;
	}

	public String getCityOfSale() {
		return cityOfSale;
	}

	public String getProductionYear() {
		return productionYear;
	}
 
	// toString
	@Override
	public String toString() {
		return "SoldVehicles [ vehicleID = " + vehicleID + ", monthOfSale = " + monthOfSale + ", cityOfSale = " + cityOfSale
				+ ", productionYear = " + productionYear + " ]";
	}
}
