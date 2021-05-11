// 250201092_250201058

package InsurancePolicyChargeCalculator;

public class Automobile extends Vehicle { // Automobile class inherits the attributes of the Vehicle class

	// Constructor
	public Automobile(String placeCity, double engineVolume,
			int yearOfProduction, String typeOfGear, int fuelTankVolume, String typeOfRoof) {
		super(placeCity, engineVolume, yearOfProduction, typeOfGear, fuelTankVolume);
		this.typeOfRoof = typeOfRoof;
	}

	private String typeOfRoof;

	//Getter and setter methods
	public String getTypeOfRoof() {
		return typeOfRoof;
	}

	public void setTypeOfRoof(String typeOfRoof) {
		this.typeOfRoof = typeOfRoof;
	}

	@Override
	public double calculateRiskFactor() {
		double riskFactor = 0;
		double plateCity = PlateCityTable(this.getPlaceCity());
		double typeOfRoof = typeOfRoofTable(this.getTypeOfRoof());
		
		riskFactor = ((this.getEngineVolume() * (0.004) * this.getFuelTankVolume()) * (2020 - this.getYearOfProduction()) * 
				(0.03 * plateCity)) / typeOfRoof;
		
		return riskFactor;
	}
	
	
}
