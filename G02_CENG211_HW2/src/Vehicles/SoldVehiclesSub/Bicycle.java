package Vehicles.SoldVehiclesSub;

import Vehicles.*;

public class Bicycle extends SoldVehicles {
	private String chainType;
	private String seatPost;
	private String vat;
	private final int BASE_PRICE = 10000;
	
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
	
	public int getBasePrice() {
		return BASE_PRICE;
	}
	
	// Methods
	private double getSctValueFromChainType(String chain) {
		switch (chain) {
		case "derailleur":
			return 1.1;
		case "onechain":
			return 1.2;
		case "doublechain":
			return 1.3;
		default:
			return -1;
		}
	}
	
	private double getSctValueFromSeatPost(String seat) {
		switch (seat) {
		case "carbonfiber":
			return 0.8;
		case "steel":
			return 0.7;
		case "aluminum":
			return 0.9;
		case "titanium":
			return 0.6;
		default:
			return -1;
		}
	}
	
	@Override
	public double calculateSCT() {
		return (getSctValueFromChainType(getChainType()) * getSctValueFromSeatPost(getSeatPost()) * 0.1) + getSctValueFromMonthOfSale(getMonthOfSale());
	}
	
	@Override
	public double calculateTotalPrice() {
		return (BASE_PRICE * 0.9) * (1 + calculateSCT()) + (1 + Double.parseDouble(getVat()) / 100);
	}

	// toString
	@Override
	public String toString() {
		return "Automobile [ vehicleID = " + getVehicleID()
				+ ", monthOfSale = " + getMonthOfSale() + ", cityOfSale = " + getCityOfSale() + ", productionYear = "
				+ getProductionYear() + ", chainType = " + chainType + ", seatPosts = " + seatPost + ", vat = " + vat + " ]";
	}
}
