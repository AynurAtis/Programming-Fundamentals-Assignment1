
// 250201092_250201058

package InsurancePolicyChargeCalculator;

public class Person extends InsuredValue { // Person class inherits the attributes of the InsuredValue class
	
	// Instance variables
	private String residenceCity;
	private String name;
	private String nationalID;
	private String gender;
	private int yearOfBirth;
	private String typeOfChronicleIllness;
	
	
	// Constructor
	public Person(String residenceCity, String name, String nationalID,
			String gender, int yearOfBirth, String typeOfChronicleIllness) 
	{
		this.residenceCity = residenceCity;
		this.name = name;
		this.nationalID = nationalID;
		this.gender = gender;
		this.yearOfBirth = yearOfBirth;
		this.typeOfChronicleIllness = typeOfChronicleIllness;
	}
	
	
	public double typeOfChronicleIllness(String typeOfChronicalIllness)
	{
		double riskFactor = 0;
		switch(typeOfChronicalIllness)
		{
		case "diabetes":
			riskFactor = 1.84;
			break;
		case "cardiovascular":
			riskFactor = 1.85;
			break;
		case "respiratory":
			riskFactor = 1.86;
			break;
		case "none":
			riskFactor = 0.1;
			break;
		case "other":
			riskFactor = 1.8;
			break;
		}
		return riskFactor;
	}
	
	

	@Override
	public double calculateRiskFactor() {
		double riskFactor = 0;
		double typeOfChronicleIllness = typeOfChronicleIllness(this.getTypeOfChronicleIllness());
		
		riskFactor =Math.pow(2020 - this.getYearOfBirth(), 2) / (typeOfChronicleIllness * 18); 
		
		return riskFactor;
	}


	//Getter and setter methods
	public String getResidenceCity() {
		return residenceCity;
	}
	public void setResidenceCity(String residenceCity) {
		this.residenceCity = residenceCity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationalID() {
		return nationalID;
	}
	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public String getTypeOfChronicleIllness() {
		return typeOfChronicleIllness;
	}
	public void setTypeOfChronicleIllness(String typeOfChronicleIllness) {
		this.typeOfChronicleIllness = typeOfChronicleIllness;
	}
	
	

}
