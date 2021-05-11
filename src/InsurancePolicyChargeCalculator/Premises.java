// 250201092_250201058

package InsurancePolicyChargeCalculator;

public class Premises extends InsuredValue { // Premises class inherits the attributes of the InsuredValue class
	
	// Instance variables
	
	private String premisesCity;
	private int numberOfFloors;
	private int yearOfConsruction;
	private String typeOfConstruction;
	private int surfaceArea;
	
	
	// Constructor
	public Premises(String premisesCity, int numberOfFloors,
		int yearOfConsruction, String typeOfConstruction, int surfaceArea) 
	{
		this.premisesCity = premisesCity;
		this.numberOfFloors = numberOfFloors;
		this.yearOfConsruction = yearOfConsruction;
		this.typeOfConstruction = typeOfConstruction;
		this.surfaceArea = surfaceArea;
	}
	
	// Recorded the values of the PremisesCityTable
	public double RiskFactorPremisesCityTable(String premisesCity) {
		double riskFactor = 0;
		switch(premisesCity)
		{
		case "Izmir":
			riskFactor = 0.4;
			break;
		case "Istanbul":
			riskFactor = 0.6;
			break;
		case "Ankara":
			riskFactor = 0.15;
			break;
		case "Other":
			riskFactor = 0.25;
			break;
		}
	return riskFactor;
	}
	
	// Recorded the values of the numberOfFloorsTable
	public double numberOfFloorsTable(int numberOfFloors)
	{
		double riskFactor = 0;
		if((numberOfFloors >= 1) && (numberOfFloors <= 3))
		{
			riskFactor = 0.1;
		}
		else if ((numberOfFloors >= 4) && (numberOfFloors <= 7))
		{
			riskFactor = 0.25;
		}
		else if ((numberOfFloors >= 8) && (numberOfFloors <= 18))
		{
			riskFactor = 0.5;
		}
		else {
			riskFactor = 0.85;
		}
		return riskFactor;
	}
	
	// Recorded the values of the yearOfConstructionTable
	public double yearOfConstructionTable(int yearOfConstruction)
	{
		double riskFactor = 0;
		if(yearOfConstruction < 1975)
		{
			riskFactor = 0.58;
		}
		else if((yearOfConstruction >= 1975) && (yearOfConstruction <= 1999))
		{
			riskFactor = 0.32;
		}
		else
		{
			riskFactor = 0.1;
		}
		return riskFactor;
	}
	
	// Recorded the values of the typeOfConstructionTable
	public double typeOfConstructionTable(String typeOfConstruction)
	{
		double riskFactor = 0;
		switch(typeOfConstruction)
		{
		case "steel":
			riskFactor = 0.1;
			break;
		case "concrete":
			riskFactor = 0.37;
			break;
		case "wood":
			riskFactor = 0.58;
			break;
		case "other":
			riskFactor = 0.92;
			break;
		}
		return riskFactor;
	}
	
	// Recorded the values of the ResidentSituationTable
	public double ResidentSituationTable(String residentSituation)
	{
		double riskFactor = 0;
		switch(residentSituation)
		{
		case "landlord":
			riskFactor = 0.42;
			break;
		case "tenant":
			riskFactor = 0.18;
			break;
		}
		return riskFactor;
	}
	

	public double calculateRiskFactor() {

		return 0;
	}
	
	//Getter and Setter methods
	public String getPremisesCity() {
		return premisesCity;
	}

	public void setPremisesCity(String premisesCity) {
		this.premisesCity = premisesCity;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

	public int getYearOfConsruction() {
		return yearOfConsruction;
	}

	public void setYearOfConsruction(int yearOfConsruction) {
		this.yearOfConsruction = yearOfConsruction;
	}

	public String getTypeOfConstruction() {
		return typeOfConstruction;
	}

	public void setTypeOfConstruction(String typeOfConstruction) {
		this.typeOfConstruction = typeOfConstruction;
	}

	public int getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(int surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	

}
