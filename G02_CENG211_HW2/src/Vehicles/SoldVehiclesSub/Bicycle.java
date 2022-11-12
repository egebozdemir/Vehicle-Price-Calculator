package Vehicles.SoldVehiclesSub;

import Vehicles.*;

public class Bicycle extends SoldVehicles {
	private String chainType;
	private String seatPost;
	private String vat;
	
	/* Constructors */
	//Empty
	public Bicycle() {
		
	}
	
	// Full
	public Bicycle(String vehicleID, String monthOfSale, String cityOfSale, String productionYear, String chainType, String seatPost, String vat) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear);
		this.chainType = chainType;
		this.seatPost = seatPost;
		this.vat = vat;
	}
	
	// Copy
	public Bicycle(Bicycle bicycle) {
		super(bicycle.getVehicleID(), bicycle.getMonthOfSale(), bicycle.getCityOfSale(), bicycle.getProductionYear());
		this.chainType = bicycle.getChainType();
		this.seatPost = bicycle.getSeatPost();
		this.vat = bicycle.getVat();
	}

	// Getters
	public String getChainType() {
		return chainType;
	}

	public String getSeatPost() {
		return seatPost;
	}

	public String getVat() {
		return vat;
	}

	// toString
	@Override
	public String toString() {
		return "Automobile [ vehicleID = " + getVehicleID()
				+ ", monthOfSale = " + getMonthOfSale() + ", cityOfSale = " + getCityOfSale() + ", productionYear = "
				+ getProductionYear() + ", chainType = " + chainType + ", seatPosts = " + seatPost + ", vat = " + vat + " ]";
	}
}
