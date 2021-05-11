// 250201092_250201058

package InsurancePolicyChargeCalculator;

import java.text.DecimalFormat;

public class Health extends Insurance{ // Health class inherits the attributes of Insurance class
	DecimalFormat df = new DecimalFormat("#.##"); 
	@Override
	public double calculatePolicyCharge(InsuredValue insuredValue) {
		
		double policyChargeOfHealthInsurance = (fixedFee * Math.pow(insuredValue.calculateRiskFactor(), 3)) / 208; // calculation of policy record
		int rank = 2020 - insuredValue.getYearOfInsurance(); // calculation of rank
		System.out.println("InsuredValue: Person Insurance Number: " + insuredValue.getInsuranceNumber() + " Year Of Insurance: " + 
				insuredValue.getYearOfInsurance());
		if((insuredValue.calculateRiskFactor() > 50) && (rank < 3))
		{	// policy record is 1000000000 so it is denied
			System.out.println("Insurance application is denied...");
			return 0;
		}
		else {
			
			System.out.println("The policy charge of " + insuredValue.getInsuranceNumber() + ": " + df.format(policyChargeOfHealthInsurance) + " TL");
		}
		return 0;
	}
	

}
