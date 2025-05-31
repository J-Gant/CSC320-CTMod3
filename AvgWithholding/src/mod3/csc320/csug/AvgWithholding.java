package mod3.csc320.csug;

import java.util.Scanner;

public class AvgWithholding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*Program written such that future changes to tax rates or income ranges can
			be updated by changing the declared variable values only.*/
		double taxRate1 = 10.0;		//All tax rates as percents
		double incomeMax1 = 500.00;	//Value of incomeMax variables are not inclusive
									//i.e. incomeMax1 = 500 means values < 500
		double taxRate2 = 15.0;
		double incomeMax2 = 1500.00;
		
		double taxRate3 = 20.0;
		double incomeMax3 = 2500.00;
		
		double taxRate4 = 30.0; 	//all incomeMax >= $2500
		
		double incomeWeekly = 0.0;
		double withholding = 0.0;
		
		System.out.println("Please enter your weekly income.");
		
		if (scanner.hasNextDouble()) {
			incomeWeekly = scanner.nextDouble();
		}
		else {
			System.out.println("Invalid entry.");
			System.exit(1);
		}
		
		if (incomeWeekly < incomeMax1) {
			withholding = incomeWeekly * taxRate1/100;
			System.out.printf("Your tax rate is %%%.0f%n", taxRate1);
			System.out.printf("$%.2f will be withheld per week.", withholding);
		}
		else if (incomeWeekly < incomeMax2) {
			withholding = incomeWeekly * taxRate2/100;
			System.out.printf("Your tax rate is %%%.0f%n", taxRate2);
			System.out.printf("$%.2f will be withheld per week.", withholding);
		}
		else if (incomeWeekly < incomeMax3) {
			withholding = incomeWeekly * taxRate3/100;
			System.out.printf("Your tax rate is %%%.0f%n", taxRate3);
			System.out.printf("$%.2f will be withheld per week.", withholding);
		}
		else {
			withholding = incomeWeekly * taxRate4/100;
			System.out.printf("Your tax rate is %%%.0f%n", taxRate4);
			System.out.printf("$%.2f will be withheld per week.", withholding);
		}
		
	}
}
