package App;

import Vehicles.*;
import Vehicles.SoldVehiclesSub.*;
import Vehicles.SoldVehiclesSub.AutomobileSub.*;

import java.io.IOException;
import java.util.ArrayList;

import FileIO.*;

public class SalesRecord {
	private ArrayList<SoldVehicles> soldVehicleArrayList;
	
	public SalesRecord() throws IOException {
		this.soldVehicleArrayList = FileIO.createVehicleListFromCsv(FileIO.PATH_TO_CSV);
	}
	
	// Methods
	private ArrayList<Sedan> soldSedanList() throws IOException {
		ArrayList<Sedan> listOfSedan = new ArrayList<>();
		Sedan tempSedan = new Sedan();
		for (SoldVehicles vehicles : soldVehicleArrayList) {
			if (vehicles.getClass().equals(tempSedan.getClass())) {
				listOfSedan.add((Sedan) vehicles);
			}
		}
		return listOfSedan;
	}
	
	private ArrayList<Hatchback> soldHatchbackList() throws IOException {
		ArrayList<Hatchback> listOfHatchback = new ArrayList<>();
		Hatchback tempHatchback = new Hatchback();
		for (SoldVehicles vehicles : soldVehicleArrayList) {
			if (vehicles.getClass().equals(tempHatchback.getClass())) {
				listOfHatchback.add((Hatchback) vehicles);
			}
		}
		return listOfHatchback;
	}
	
	private ArrayList<Minivan> soldMinivanList() throws IOException {
		ArrayList<Minivan> listOfMinivan = new ArrayList<>();
		Minivan tempMinivan = new Minivan();
		for (SoldVehicles vehicles : soldVehicleArrayList) {
			if (vehicles.getClass().equals(tempMinivan.getClass())) {
				listOfMinivan.add((Minivan) vehicles);
			}
		}
		return listOfMinivan;
	}
	
	private ArrayList<PickupTruck> soldPickupTruckList() throws IOException {
		ArrayList<PickupTruck> listOfPickupTruck = new ArrayList<>();
		PickupTruck tempPickupTruck = new PickupTruck();
		for (SoldVehicles vehicles : soldVehicleArrayList) {
			if (vehicles.getClass().equals(tempPickupTruck.getClass())) {
				listOfPickupTruck.add((PickupTruck) vehicles);
			}
		}
		return listOfPickupTruck;
	}
	
	private ArrayList<Bicycle> soldBicycleList() throws IOException {
		ArrayList<Bicycle> listOfBicycle = new ArrayList<>();
		Bicycle tempBicycle = new Bicycle();
		for (SoldVehicles vehicles : soldVehicleArrayList) {
			if (vehicles.getClass().equals(tempBicycle.getClass())) {
				listOfBicycle.add((Bicycle) vehicles);
			}
		}
		return listOfBicycle;
	}	
}
