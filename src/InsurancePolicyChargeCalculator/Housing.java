// 250201092_250201058

package InsurancePolicyChargeCalculator;

public class Housing extends Premises { // Housing class inherits the attributes of the Premises class

	// Constructor
	public Housing(String premisesCity, int numberOfFloors,int yearOfConsruction, String typeOfConstruction,
			 int surfaceArea, String residentSituation) {
		super(premisesCity, numberOfFloors, yearOfConsruction, typeOfConstruction,
				surfaceArea);
		this.residentSituation = residentSituation;
	}

	private String residentSituation;

	// Getter and Setter methods
	public String getResidentSituation() {
		return residentSituation;
	}

	public void setResidentSituation(String residentSituation) {
		this.residentSituation = residentSituation;
	}

	@Override
	public double calculateRiskFactor() {
		double riskFactor = 0;
		double premisesCityriskFactor = RiskFactorPremisesCityTable(this.getPremisesCity());
		double numberOfFloors = numberOfFloorsTable(this.getNumberOfFloors());
		double yearOfConstruction = yearOfConstructionTable(this.getYearOfConsruction());
		double typeOfConstruction = typeOfConstructionTable(this.getTypeOfConstruction());
		double residentSituation = ResidentSituationTable(this.getResidentSituation());
		
		riskFactor = ((premisesCityriskFactor * numberOfFloors * yearOfConstruction * typeOfConstruction)* 
				this.getSurfaceArea())/residentSituation;
		
		return riskFactor;
	}
	
	
	
}
