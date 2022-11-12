package Vehicles.SoldVehiclesSub;

import Vehicles.*;

public class PickupTruck extends SoldVehicles {
	private String capType;
	private String truckBedType;
	private String vat;
	
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

	// toString
	@Override
	public String toString() {
		return "Automobile [ vehicleID = " + getVehicleID()
				+ ", monthOfSale = " + getMonthOfSale() + ", cityOfSale = " + getCityOfSale() + ", productionYear = "
				+ getProductionYear() + ", capType = " + capType + ", truckBedType = " + truckBedType + ", vat = " + vat + " ]";
	}
}
