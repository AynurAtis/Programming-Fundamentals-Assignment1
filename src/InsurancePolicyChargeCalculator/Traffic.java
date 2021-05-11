// 250201092_250201058

package InsurancePolicyChargeCalculator;

import java.text.DecimalFormat;

public class Traffic extends Insurance{ // Traffic class inherits the attributes of Insurance class
	DecimalFormat df = new DecimalFormat("#.##");
	@Override
	public double calculatePolicyCharge(InsuredValue insuredValue) {
		
		double policyChargeOfTrafficInsurance = (fixedFee * 0.9) + (fixedFee * Math.sqrt(insuredValue.calculateRiskFactor())); // calculation of policy record
		int rank = 2020 - insuredValue.getYearOfInsurance(); // calculation of rank
		char type = insuredValue.getInsuranceNumber().charAt(0); // first letter of the insuredValue
		if(type == 'A')
		{
			System.out.println("InsuredValue: Automobile Insurance Number: " + insuredValue.getInsuranceNumber() + " Year Of Insurance: " + 
					insuredValue.getYearOfInsurance());
		}
		else if(type == 'T')
		{
			System.out.println("InsuredValue: Truck Insurance Number: " + insuredValue.getInsuranceNumber() + " Year Of Insurance: " + 
					insuredValue.getYearOfInsurance());
		}
		if(rank > 1)
		{
			policyChargeOfTrafficInsurance -= (policyChargeOfTrafficInsurance * 0.2); // discount %20
			System.out.println("The policy charge of " + insuredValue.getInsuranceNumber() + ": " + df.format(policyChargeOfTrafficInsurance) + " TL");
		}
		else {
			
			System.out.println("The policy charge of " + insuredValue.getInsuranceNumber() + ": " + df.format(policyChargeOfTrafficInsurance) + " TL");
		}
		return 0;
	}
}
