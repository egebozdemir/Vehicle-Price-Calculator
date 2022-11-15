package FileIO;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import Vehicles.*;
import Vehicles.SoldVehiclesSub.*;
import Vehicles.SoldVehiclesSub.AutomobileSub.*;

public class FileIO {
	public final static String PATH_TO_CSV = "Csv/HW2_SoldVehicles.csv";
	
	/* Csv reading */
	private static BufferedReader readCsv(String pathToFile) throws FileNotFoundException {
		return new BufferedReader(new FileReader(pathToFile));
	}
	public static ArrayList<SoldVehicles> createVehicleListFromCsv(String pathToFile) throws IOException {
		BufferedReader reader = readCsv(pathToFile);
		ArrayList<SoldVehicles> vehicleArrayList = new ArrayList<>();
		String line = null;
		while ((line = reader.readLine()) != null) {
			vehicleArrayList.add(createVehicleFromCsv(line));
		}
		return vehicleArrayList;
	}
	
	/* Object creation from csv lines */	
	private static SoldVehicles createVehicleFromCsv(String csvLine) {
		StringTokenizer tokenizer = new StringTokenizer(csvLine, ",");
		switch (csvLine.charAt(0)) {
			case 'B':
				Bicycle bicycle = new Bicycle(tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken());
				return bicycle; // We didn't use break statement beacuse we use return statement in every case.
			case 'P':
				PickupTruck pickupTruck = new PickupTruck(tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken());
				return pickupTruck;
			case 'H':
				Hatchback hatchback = new Hatchback(tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken());
				return hatchback;
			case 'M':
				Minivan minivan = new Minivan(tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken());
				return minivan;
			case 'S':
				Sedan sedan = new Sedan(tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken());
				return sedan;
		}
		return null;
	}
}
