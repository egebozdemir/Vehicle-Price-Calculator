package App;

import Vehicles.*;
import Vehicles.SoldVehiclesSub.*;
import Vehicles.SoldVehiclesSub.AutomobileSub.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import FileIO.*;

public class SalesRecord {
	private  ArrayList<SoldVehicles> soldVehicleArrayList;
	
	public SalesRecord() throws IOException {
		this.soldVehicleArrayList = FileIO.createVehicleListFromCsv(FileIO.PATH_TO_CSV);
	}
	
	// Methods
	private ArrayList<SoldVehicles> soldSedanList() throws IOException {
		ArrayList<SoldVehicles> listOfSedan = new ArrayList<>();
		Sedan tempSedan = new Sedan();
		for (SoldVehicles vehicles : soldVehicleArrayList) {
			if (vehicles.getClass().equals(tempSedan.getClass())) {
				listOfSedan.add((Sedan) vehicles);
			}
		}
		return listOfSedan;
	}
	
	private ArrayList<SoldVehicles> soldHatchbackList() throws IOException {
		ArrayList<SoldVehicles> listOfHatchback = new ArrayList<>();
		Hatchback tempHatchback = new Hatchback();
		for (SoldVehicles vehicles : soldVehicleArrayList) {
			if (vehicles.getClass().equals(tempHatchback.getClass())) {
				listOfHatchback.add((Hatchback) vehicles);
			}
		}
		return listOfHatchback;
	}
	
	private ArrayList<SoldVehicles> soldMinivanList() throws IOException {
		ArrayList<SoldVehicles> listOfMinivan = new ArrayList<>();
		Minivan tempMinivan = new Minivan();
		for (SoldVehicles vehicles : soldVehicleArrayList) {
			if (vehicles.getClass().equals(tempMinivan.getClass())) {
				listOfMinivan.add((Minivan) vehicles);
			}
		}
		return listOfMinivan;
	}
	
	private ArrayList<SoldVehicles> soldPickupTruckList() throws IOException {
		ArrayList<SoldVehicles> listOfPickupTruck = new ArrayList<>();
		PickupTruck tempPickupTruck = new PickupTruck();
		for (SoldVehicles vehicles : soldVehicleArrayList) {
			if (vehicles.getClass().equals(tempPickupTruck.getClass())) {
				listOfPickupTruck.add((PickupTruck) vehicles);
			}
		}
		return listOfPickupTruck;
	}
	
	private ArrayList<SoldVehicles> soldBicycleList() throws IOException {
		ArrayList<SoldVehicles> listOfBicycle = new ArrayList<>();
		Bicycle tempBicycle = new Bicycle();  
		for (SoldVehicles vehicles : soldVehicleArrayList) {
			if (vehicles.getClass().equals(tempBicycle.getClass())) {
				listOfBicycle.add((Bicycle) vehicles);
			}
		}
		return listOfBicycle;
	}
	
	private void printArrayListItems(ArrayList<SoldVehicles> vehicleArrList) {
		for (SoldVehicles vehicle : vehicleArrList) {
			System.out.println(vehicle);
		}
	}
	
	public void display() throws IOException {

		Scanner keyboard = new Scanner(System.in);

		String welcomingMessage = "Please press,\n" +
		"0 to see all choices again\n" +
		"1 to see all sold vehicles list\n" +
		"2 to see sold sedan list\n" + 
		"3 to see sold hatchback list\n" +
		"4 to see sold minivan list\n" +
		"5 to see sold pickup truck list\n" +
		"6 to see sold bicycle list\n" +
		"7 to exit";

		System.out.println(welcomingMessage);

		int choice = 0;

		while (choice != 7) {

			System.out.println("Please enter your choice: ");

			choice = keyboard.nextInt();
			keyboard.nextLine();

			switch (choice) {
				case 0:
					System.out.println(welcomingMessage);
					break;
				case 1:
					printArrayListItems(soldVehicleArrayList);
					break;
				case 2:
					printArrayListItems(soldSedanList());
					break;
				case 3:
					printArrayListItems(soldHatchbackList());
					break;
				case 4:
					printArrayListItems(soldMinivanList());
					break;
				case 5:
					printArrayListItems(soldPickupTruckList());;
					break;
				case 6:
					printArrayListItems(soldBicycleList());
					break;
				case 7: 
					System.out.println("Bye!");
					keyboard.close();
					System.exit(0);
				default:
					System.out.println("Not a valid choice. Try again.");
					break;
			}
		}
		
	}
}
