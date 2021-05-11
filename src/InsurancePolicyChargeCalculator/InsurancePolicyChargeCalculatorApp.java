// 250201092_250201058

package InsurancePolicyChargeCalculator;

import java.util.Scanner;
import java.io.IOException;

public class InsurancePolicyChargeCalculatorApp {
	
	public static void main(String[] args) throws IOException
	{

		System.out.print("Please enter your choice: ");
		Scanner scanner = new Scanner(System.in); // Getting an input of user
		String option = scanner.nextLine();
		PolicyRecord policyRecord = new PolicyRecord(); // Creates the policyRecord objects
		switch(Integer.parseInt(option))
		{
		case 1:
			for(int i = 0; i<4; i++)
			{
			Insurance insurance1 = new Traffic(); // Created the insurance object from Traffic class
			Insurance insurance2 = new Health(); // Created the insurance object from Health class
			Insurance insurance3 = new Household(); // Created the insurance object from Household class
			// Getting the policy charge of all objects
			insurance1.calculatePolicyCharge(policyRecord.AutomobileInsuredValue().get(i));
			insurance1.calculatePolicyCharge(policyRecord.TruckInsuredValue().get(i));
			insurance2.calculatePolicyCharge(policyRecord.PersonInsuredValue().get(i));
			insurance3.calculatePolicyCharge(policyRecord.WorkPlaceInsuredValue().get(i));
			insurance3.calculatePolicyCharge(policyRecord.HousingInsuredValue().get(i));
			
			}
		case 2:
			for(int i = 0; i<4; i++)
			{
				
			Insurance insurance = new Household(); // Created the insurance object from Household class
			// Getting the policy charge of WorkPlace objects
			insurance.calculatePolicyCharge(policyRecord.WorkPlaceInsuredValue().get(i));
			}
			break;
		case 3:
			for(int i = 0; i<4; i++)
			{
			Insurance insurance = new Household(); // Created the insurance object from Household class
			// Getting the policy charge of Housing objects
			insurance.calculatePolicyCharge(policyRecord.HousingInsuredValue().get(i));
			}
			break;
		case 4:
			for(int i = 0; i<4; i++)
			{
			Insurance insurance = new Health(); // Created the insurance object from Health class
			// Getting the policy charge of Person objects
			insurance.calculatePolicyCharge(policyRecord.PersonInsuredValue().get(i));
			}
			break;
		case 5:
			for(int i = 0; i<4; i++)
			{
			Insurance insurance = new Traffic(); // Created the insurance object from Traffic class
			// Getting the policy charge of Automobile objects
			insurance.calculatePolicyCharge(policyRecord.AutomobileInsuredValue().get(i));
			}
			break;
		case 6:
			for(int i = 0; i<4; i++)
			{
			Insurance insurance = new Traffic(); // Created the insurance object from Traffic class
			// Getting the policy charge of Truck objects
			insurance.calculatePolicyCharge(policyRecord.TruckInsuredValue().get(i));
			}
			break;
		default:
			System.out.println("Invalid options....");
			break;
		}
		
	}
	
}
