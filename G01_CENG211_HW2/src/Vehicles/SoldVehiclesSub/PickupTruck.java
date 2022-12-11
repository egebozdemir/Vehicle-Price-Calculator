package Vehicles.SoldVehiclesSub;

import Vehicles.*;

public class PickupTruck extends SoldVehicles {
	private String cabType;
	private String truckBedType;
	private String vat;
	private final int BASE_PRICE = 250000;
	
	/* Constructors */
	//Empty
	public PickupTruck() {
		
	}
	
	// Full
	public PickupTruck(String vehicleID, String monthOfSale, String cityOfSale, String productionYear, String cabType, String truckBedType, String vat) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear);
		this.cabType = cabType;
		this.truckBedType = truckBedType;
		this.vat = vat;
	}
	
	// Copy
	public PickupTruck(PickupTruck pickupTruck) {
		super(pickupTruck.getVehicleID(), pickupTruck.getMonthOfSale(), pickupTruck.getCityOfSale(), pickupTruck.getProductionYear());
		this.cabType = pickupTruck.getCabType();
		this.truckBedType = pickupTruck.getTruckBedType();
		this.vat = pickupTruck.getVat();
	}

	// Getters
	public String getCabType() {
		return cabType;
	}

	public String getTruckBedType() {
		return truckBedType;
	}

	public String getVat() {
		return vat;
	}
	
	public int getBasePrice() {
		return BASE_PRICE;
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
		return (getSctValueFromTruckBedType(getTruckBedType()) * getSctValueFromProductionYear(getProductionYear())) / getSctValueFromCabType(getCabType());
	}
	
	@Override
	public double calculateTotalPrice() {
		return (BASE_PRICE) * (1 + calculateSCT() * 0.6) + (1 + Double.parseDouble(getVat()) / 100);
	}

	// toString
	@Override
	public String toString() {
		return "Vehicle: Pickup Truck, " + super.toString();
	}
}
