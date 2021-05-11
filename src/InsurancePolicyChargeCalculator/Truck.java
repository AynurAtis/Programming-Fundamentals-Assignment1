// 250201092_250201058

package InsurancePolicyChargeCalculator;

public class Truck extends Vehicle{ // Truck class inherits the attributes of the Vehicle class
	
	
	private String typeOfTruckBed;
	
	// Constructor
	public Truck(String placeCity, double engineVolume,int yearOfProduction, String typeOfGear,
			 int fuelTankVolume, String typeOfTruckBed) 
	{
		
		super(placeCity, engineVolume, yearOfProduction, typeOfGear, fuelTankVolume);
		this.typeOfTruckBed = typeOfTruckBed;

	}

	
	@Override
	public double calculateRiskFactor() {
		double riskFactor = 0;
		double plateCity = PlateCityTable(this.getPlaceCity());
		double typeOfTruckBed = typeOfTruckBedTable(this.getTypeOfTruckBed());
		
		riskFactor = ((Math.pow(2020 - this.getYearOfProduction() , 3) / (0.008 * this.getFuelTankVolume())) * 
				this.getEngineVolume() * (plateCity * 0.03)) / Math.pow(typeOfTruckBed, 2);
		
		return riskFactor;
	}


	// Getter and setter methods
	public String getTypeOfTruckBed() {
		return typeOfTruckBed;
	}

	public void setTypeOfTruckBed(String typeOfTruckBed) {
		this.typeOfTruckBed = typeOfTruckBed;
	}
	
	
	

}
