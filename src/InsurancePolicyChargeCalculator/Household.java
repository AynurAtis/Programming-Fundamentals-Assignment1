// 250201092_250201058

package InsurancePolicyChargeCalculator;

import java.text.DecimalFormat;

public class Household extends Insurance { // Household class inherits the attributes of the Insurance class
	DecimalFormat df = new DecimalFormat("#.##");
	
	@Override
	public double calculatePolicyCharge(InsuredValue insuredValue) {
		double policyChargeOfHouseholdInsurance = fixedFee * Math.pow(insuredValue.calculateRiskFactor(), 2); // calculation of policy charge
		int rank = 2020 - insuredValue.getYearOfInsurance(); // calculation of rank
		char type = insuredValue.getInsuranceNumber().charAt(0); // first letter of the insuredValue
		if(type == 'W')
		{
			System.out.println("InsuredValue: WorkPlace Insurance Number: " + insuredValue.getInsuranceNumber() + " Year Of Insurance: " + 
					insuredValue.getYearOfInsurance());
		}
		else if(type == 'H')
		{
			System.out.println("InsuredValue: Housing Insurance Number: " + insuredValue.getInsuranceNumber() + " Year Of Insurance: " + 
					insuredValue.getYearOfInsurance());
		}
		if(rank > 2)
		{
			policyChargeOfHouseholdInsurance -= (policyChargeOfHouseholdInsurance * 0.1); // discount %10
			System.out.println("The policy charge of " + insuredValue.getInsuranceNumber() + ": " + df.format(policyChargeOfHouseholdInsurance) + " TL");
		}
		else {
			
			System.out.println("The policy charge of " + insuredValue.getInsuranceNumber() + ": " + df.format(policyChargeOfHouseholdInsurance) + " TL");
		}
		return 0;
	}
	
}
