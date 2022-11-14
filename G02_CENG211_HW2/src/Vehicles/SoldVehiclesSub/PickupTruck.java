package Vehicles.SoldVehiclesSub;

import Vehicles.*;

public class PickupTruck extends SoldVehicles {
	private String capType;
	private String truckBedType;
	private String vat;
	private final int basePrice = 250000;
	
	/* Constructors */
	//Empty
	public PickupTruck() {
		
	}
	
	// Full
	public PickupTruck(String vehicleID, String monthOfSale, String cityOfSale, String productionYear, String capType, String truckBedType, String vat) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear);
		this.capType = capType;
		this.truckBedType = truckBedType;
		this.vat = vat;
	}
	
	// Copy
	public PickupTruck(PickupTruck pickupTruck) {
		super(pickupTruck.getVehicleID(), pickupTruck.getMonthOfSale(), pickupTruck.getCityOfSale(), pickupTruck.getProductionYear());
		this.capType = pickupTruck.getCapType();
		this.truckBedType = pickupTruck.getTruckBedType();
		this.vat = pickupTruck.getVat();
	}

	// Getters
	public String getCapType() {
		return capType;
	}

	public String getTruckBedType() {
		return truckBedType;
	}

	public String getVat() {
		return vat;
	}
	
	public int getBasePrice() {
		return basePrice;
	}
	
  // Methods
	private double getSctValueFromCabType(String cab) {
		switch (cab) {
		case "regular":
			return 2.5;
		case "extended":
			return 2.8;
		case "crew":
			return 3;
		default:
			return -1;
		}
	}
	
	private double getSctValueFromTruckBedType(String bed) {
		switch (bed) {
		case "regular":
			return 0.5;
		case "tanker":
			return 0.8;
		case "trailer":
			return 1;
		default:
			return -1;
		}
	}
	
	@Override
	public double calculateSCT() {
		return (getSctValueFromTruckBedType(getTruckBedType()) * getSctValueFromProductionYear(getProductionYear())) / getSctValueFromCabType(getCapType());
	}

	// toString
	@Override
	public String toString() {
		return "Automobile [ vehicleID = " + getVehicleID()
				+ ", monthOfSale = " + getMonthOfSale() + ", cityOfSale = " + getCityOfSale() + ", productionYear = "
				+ getProductionYear() + ", capType = " + capType + ", truckBedType = " + truckBedType + ", vat = " + vat + " ]";
	}
}
