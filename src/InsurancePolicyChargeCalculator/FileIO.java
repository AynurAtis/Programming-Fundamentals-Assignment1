// 250201092_250201058

package InsurancePolicyChargeCalculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {
	
	// Read the "HW2_InsuredValues.csv" file and stored the 2 dimensional array named ItemList
	public void readFile(String[][] ItemList) throws IOException {
		String fileName = "HW2_InsuredValues.csv";
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		
		String[] lineSplit=null;
		String line = null;
		for(int i=0; i<20; i++)
		{
			line = reader.readLine();
			if(line != null)
			{
				lineSplit = line.split(",");
				
				for (int j=0; j<8; j++)
				{
					ItemList[i][j] = lineSplit[j];
				}
			}
			
		}
		reader.close();
		
	}
	
	// WorkPlace items stored the other 2 dimensional array named WorkPlaceList in ItemList array
	public void WorkPlace(String[][] WorkPlaceList) throws IOException {
		String[][] ItemList = new String[20][8];
		readFile(ItemList);
		int m = 0;
		for(int i=0; i<20; i++)
		{
			String insuranceNumber = ItemList[i][0];
			if(insuranceNumber.charAt(0) == 'W')
			{
				for(int j =0; j<8; j++)
				{
					WorkPlaceList[m][j] = ItemList[i][j];
					
				}
				m++;
			}
		}
		
	}
	
	// Housing items stored the other 2 dimensional array named HousingList in ItemList array
	public void Housing(String[][] HousingList) throws IOException {
		String[][] ItemList = new String[20][8];
		readFile(ItemList);
		int m = 0;
		for(int i=0; i<20; i++)
		{
			String insuranceNumber = ItemList[i][0];
			if(insuranceNumber.charAt(0) == 'H')
			{
				for(int j =0; j<8; j++)
				{
					HousingList[m][j] = ItemList[i][j];
					
				}
				m++;
			}
		}	
	}
	
	// Automobile items stored the other 2 dimensional array named AutomobileList in ItemList array
	public void Automobile(String[][] AutomobileList) throws IOException {
		String[][] ItemList = new String[20][8];
		readFile(ItemList);
		int m = 0;
		for(int i=0; i<20; i++)
		{
			String insuranceNumber = ItemList[i][0];
			if(insuranceNumber.charAt(0) == 'A')
			{
				for(int j =0; j<8; j++)
				{
					AutomobileList[m][j] = ItemList[i][j];
					
				}
				m++;
			}
		}
	}
	
	// Truck items stored the other 2 dimensional array named TruckList in ItemList array
	public void Truck(String[][] TruckList) throws IOException {
		String[][] ItemList = new String[20][8];
		readFile(ItemList);
		int m = 0;
		for(int i=0; i<20; i++)
		{
			String insuranceNumber = ItemList[i][0];
			if(insuranceNumber.charAt(0) == 'T')
			{
				for(int j =0; j<8; j++)
				{
					TruckList[m][j] = ItemList[i][j];
					
				}
				m++;
			}
		}
	}
	
	// Person items stored the other 2 dimensional array named PersonList in ItemList array
	public void Person(String[][] PersonList) throws IOException {
		String[][] ItemList = new String[20][8];
		readFile(ItemList);
		int m = 0;
		for(int i=0; i<20; i++)
		{
			String insuranceNumber = ItemList[i][0];
			if(insuranceNumber.charAt(0) == 'P')
			{
				for(int j =0; j<8; j++)
				{
					PersonList[m][j] = ItemList[i][j];
					
				}
				m++;
			}
		}
	}
}
