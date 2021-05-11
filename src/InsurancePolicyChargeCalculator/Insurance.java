// 250201092_250201058

package InsurancePolicyChargeCalculator;

import java.util.Random;

public class Insurance {
	// Created fixedFee as a random between 1000 to 3000
	Random rnd = new Random();
	int Low = 1000;
	int High = 3000;
	int fixedFee = rnd.nextInt(High - Low) + Low;
	
	public double calculatePolicyCharge(InsuredValue insuredValue)
	{
		return 0;
	}


}
