// 250201092_250201058

package InsurancePolicyChargeCalculator;

public class Vehicle extends InsuredValue { // Vehicle class inherits the attributes of the InsuredValue class
	
	// Instance variables
	private String placeCity;
	private double engineVolume;
	private int yearOfProduction;
	private String typeOfGear;
	private int fuelTankVolume;
	

	// Constructor
	public Vehicle(String placeCity, double engineVolume,
		int yearOfProduction, String typeOfGear, int fuelTankVolume) 
	{
		this.placeCity = placeCity;
		this.engineVolume = engineVolume;
		this.yearOfProduction = yearOfProduction;
		this.typeOfGear = typeOfGear;
		this.fuelTankVolume = fuelTankVolume;
	}
	
	// Record the values of the typeOfGearTable
	public double typeOfGearTable(String typeOfGear)
	{
		double riskFactor =0;
		switch(typeOfGear)
		{
		case "manual":
			riskFactor = 0.47;
			break;
		case "automatic":
			riskFactor = 0.98;
			break;
		}
		return riskFactor;
	}
	// Record the values of the typeOfRoofTable
	public double typeOfRoofTable(String typeOfRoof)
	{
		double riskFactor = 0;
		switch(typeOfRoof)
		{
		case "regular":
			riskFactor = 0.1;
			break;
		case "sunroof":
			riskFactor = 0.64;
			break;
		case "moonroof":
			riskFactor = 0.48; 
			break;
		}
		return riskFactor;
	}
	// Record the values of the PlateCityTable
	public double PlateCityTable (String plateCity)
	{
		double riskFactor = 0;
		switch(plateCity)
		{
		case "Izmir":
			riskFactor = 0.78;
			break;
		case "Istanbul":
			riskFactor = 0.97;
			break;
		case "Ankara":
			riskFactor = 0.85;
			break;
		case "Other":
			riskFactor = 0.65;
			break;
		}
		return riskFactor;
	}
	// Record the values of the typeOfTruckBedTable
	public double typeOfTruckBedTable(String typeOfTruckBed)
	{
		double riskFactor = 0;
		switch(typeOfTruckBed)
		{
		case "trailer":
			riskFactor = 0.87;
			break;
		case "regular":
			riskFactor = 0.15;
			break;
		case "tanker":
			riskFactor = 0.84;
			break;
		}
		return riskFactor;
	}
	
	
	
	@Override
	public double calculateRiskFactor() {
		return 0;
	}

	// Getter and setter methods
	
	public String getPlaceCity() {
		return placeCity;
	}
	public void setPlaceCity(String placeCity) {
		this.placeCity = placeCity;
	}
	public double getEngineVolume() {
		return engineVolume;
	}
	public void setEngineVolume(double engineVolume) {
		this.engineVolume = engineVolume;
	}
	public int getYearOfProduction() {
		return yearOfProduction;
	}
	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}
	public String getTypeOfGear() {
		return typeOfGear;
	}
	public void setTypeOfGear(String typeOfGear) {
		this.typeOfGear = typeOfGear;
	}
	public int getFuelTankVolume() {
		return fuelTankVolume;
	}
	public void setFuelTankVolume(int fuelTankVolume) {
		this.fuelTankVolume = fuelTankVolume;
	}
	

}
