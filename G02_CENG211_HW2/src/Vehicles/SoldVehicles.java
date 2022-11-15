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
	
	// Methods
	
	public double calculateSCT() {
		return 0;
	}
	
	protected double getSctValueFromMonthOfSale(String month) {
		switch (month) {
		case "January":
			return 0.3;
		case "May":
			return 0.4;
		case "August":
			return 0.5;
		case "October":
			return 0.6;
		case "December":
			return 0.7;
		default:
			return -1;
		}
	}
	
	protected double getSctValueFromCityOfSale(String city) {
		switch (city) {
		case "Izmir":
			return 0.1;
		case "Istanbul":
			return 0.3;
		case "Ankara":
			return 0.2;
		default:
			return -1;
		}
	}
	
	protected double getSctValueFromProductionYear(String year) {
		int intYear = Integer.parseInt(year);
		switch (intYear) {
		case 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008:
			return 1;
		case 2012, 2013, 2014, 2015, 2016, 2017:
			return 1.2;
		case 2018, 2019, 2020, 2021, 2022:
			return 1.6;
		default:
			return -1;
		}
	}
	
	public double calculateTotalPrice() {
		return 0;
	}
 
	// toString
	@Override
	public String toString() {
		return "SoldVehicles [ vehicleID = " + vehicleID + ", monthOfSale = " + monthOfSale + ", cityOfSale = " + cityOfSale
				+ ", productionYear = " + productionYear + " ]";
	}
}
