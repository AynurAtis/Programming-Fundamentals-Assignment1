// 250201092_250201058

package InsurancePolicyChargeCalculator;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class PolicyRecord {
	FileIO file = new FileIO();
	DecimalFormat df = new DecimalFormat("#.##");

	public ArrayList<InsuredValue> WorkPlaceInsuredValue() throws IOException {
		String[][] WorkPlaceList = new String[4][8];
		file.WorkPlace(WorkPlaceList);
		ArrayList<InsuredValue> WorkPlaceInsValue = new ArrayList<InsuredValue>(); // Created empty ArrayList for WorkPlace InsuredValue  
		for(int i=0; i<4; i++)
		{
			// Created the objects that WorkPlace
			InsuredValue insuredValue = new WorkPlace(WorkPlaceList[i][2], 
					Integer.parseInt(WorkPlaceList[i][3]), Integer.parseInt(WorkPlaceList[i][4]), WorkPlaceList[i][5], 
					Integer.parseInt(WorkPlaceList[i][6]), Integer.parseInt(WorkPlaceList[i][7]));
			insuredValue.setInsuranceNumber(WorkPlaceList[i][0]);
			insuredValue.setYearOfInsurance(Integer.parseInt(WorkPlaceList[i][1]));
			WorkPlaceInsValue.add(insuredValue); // Added the objects to the WorkPlaceInsValue ArrayList 
		}
		
		return WorkPlaceInsValue;
	}
	
	public ArrayList<InsuredValue> HousingInsuredValue() throws IOException {
		ArrayList<InsuredValue> HousingInsValue = new ArrayList<InsuredValue>();
		String[][] HousingList = new String[4][8];
		file.Housing(HousingList);
		for(int i=0; i<4; i++)
		{
			// Created the objects that Housing
			InsuredValue insuredValue = new Housing(HousingList[i][2], 
					Integer.parseInt(HousingList[i][3]), Integer.parseInt(HousingList[i][4]), HousingList[i][5], 
					Integer.parseInt(HousingList[i][6]), HousingList[i][7]);
			insuredValue.setInsuranceNumber(HousingList[i][0]);
			insuredValue.setYearOfInsurance(Integer.parseInt(HousingList[i][1]));
			HousingInsValue.add(insuredValue); // Added the objects to the HousingInsValue ArrayList
		}
		return HousingInsValue;
	}
	
	public ArrayList<InsuredValue> AutomobileInsuredValue() throws IOException {
		ArrayList<InsuredValue> AutomobileInsValue = new ArrayList<InsuredValue>();
		String[][] AutomobileList = new String[4][8];
		file.Automobile(AutomobileList);
		for(int i=0; i<4; i++)
		{
			// Created the objects that Automobile
			InsuredValue insuredValue = new Automobile(AutomobileList[i][2], 
					Double.parseDouble(AutomobileList[i][3]), Integer.parseInt(AutomobileList[i][4]), AutomobileList[i][5], 
					Integer.parseInt(AutomobileList[i][6]), AutomobileList[i][7]);
			insuredValue.setInsuranceNumber(AutomobileList[i][0]);
			insuredValue.setYearOfInsurance(Integer.parseInt(AutomobileList[i][1]));
			AutomobileInsValue.add(insuredValue); // Added the objects to the AutomobileInsValue ArrayList
		}
		return AutomobileInsValue;
	}
	
	public ArrayList<InsuredValue> TruckInsuredValue () throws IOException {
		ArrayList<InsuredValue> TruckInsValue = new ArrayList<InsuredValue>();
		String[][] TruckList = new String[4][8];
		file.Truck(TruckList);
		for(int i=0; i<4; i++)
		{
			// Created the objects that Truck
			InsuredValue insuredValue = new Truck(TruckList[i][2], 
					Double.parseDouble(TruckList[i][3]), Integer.parseInt(TruckList[i][4]), TruckList[i][5], 
					Integer.parseInt(TruckList[i][6]), TruckList[i][7]);
			insuredValue.setInsuranceNumber(TruckList[i][0]);
			insuredValue.setYearOfInsurance(Integer.parseInt(TruckList[i][1]));
			TruckInsValue.add(insuredValue); // Added the objects to the TruckInsValue ArrayList
		}
		return TruckInsValue;
	}
	
	public ArrayList<InsuredValue> PersonInsuredValue() throws IOException{

		ArrayList<InsuredValue> PersonInsValue = new ArrayList<InsuredValue>();
		String[][] PersonList = new String[4][8];
		file.Person(PersonList);
		for(int i=0; i<4; i++)
		{
			// Created the objects that Person
			InsuredValue insuredValue = new Person(PersonList[i][2], 
					PersonList[i][3], PersonList[i][4], PersonList[i][5], 
					Integer.parseInt(PersonList[i][6]), PersonList[i][7]);
			insuredValue.setInsuranceNumber(PersonList[i][0]);
			insuredValue.setYearOfInsurance(Integer.parseInt(PersonList[i][1]));
			PersonInsValue.add(insuredValue);  // Added the objects to the PersonInsValue ArrayList
		}
		return PersonInsValue;
	}
	
	
	
	
	
	
	
}
