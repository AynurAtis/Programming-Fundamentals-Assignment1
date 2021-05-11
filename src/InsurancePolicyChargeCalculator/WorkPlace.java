// 250201092_250201058

package InsurancePolicyChargeCalculator;

public class WorkPlace extends Premises { // WorkPlace class inherits the attributes of the Premises class
	
	
	// Constructor 
	public WorkPlace(String premisesCity, int numberOfFloors,
			int yearOfConsruction, String typeOfConstruction, int surfaceArea, int annualRevenue) {
		super(premisesCity, numberOfFloors, yearOfConsruction, typeOfConstruction,
				surfaceArea);
		this.annualRevenue = annualRevenue;

	}

	private int annualRevenue;

	// Getter and Setter methods
	public int getAnnualRevenue() {
		return annualRevenue;
	}

	public void setAnnualRevenue(int annualRevenue) {
		this.annualRevenue = annualRevenue;
	}

	@Override
	public double calculateRiskFactor() {
		double riskFactor = 0;
		double premisesCityriskFactor = RiskFactorPremisesCityTable(this.getPremisesCity()); 
		double numberOfFloors = numberOfFloorsTable(this.getNumberOfFloors());
		double yearOfConstruction = yearOfConstructionTable(this.getYearOfConsruction());
		double typeOfConstruction = typeOfConstructionTable(this.getTypeOfConstruction());
		
		riskFactor = (premisesCityriskFactor * numberOfFloors * yearOfConstruction * typeOfConstruction * 
				(this.getSurfaceArea() * 0.2)) * (this.getAnnualRevenue() * 0.003);
		
		return riskFactor;
	}
	
	
	
}
