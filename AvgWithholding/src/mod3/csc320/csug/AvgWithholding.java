package mod3.csc320.csug;

import java.util.Scanner;

public class AvgWithholding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		TaxCalculations taxRate1 = new TaxCalculations(0.1);
		TaxCalculations taxRate2 = new TaxCalculations(0.15);
		TaxCalculations taxRate3 = new TaxCalculations(0.2);
		TaxCalculations taxRate4 = new TaxCalculations(0.3);
		
		System.out.println("Please choose one of the following options:");
		System.out.println("For administrator options type \"A\"\n");
		System.out.println("For employee options type \"E\"");
		
		String mainMenuSelection = scanner.next();
		if (mainMenuSelection.equalsIgnoreCase("A")) {
			System.out.println("Print display of current taxRates with getter and provide "
					+ "options to set new taxrates");
		}
		else if (mainMenuSelection.equalsIgnoreCase("E")) {
			
			System.out.println("To view your current tax rate and witholding "
				+ "please enter your weekly income.\n");
			
			double incomeWeekly = 0.0;
	
			if (scanner.hasNextDouble()) {
				incomeWeekly = scanner.nextDouble();
			}
			else {
				System.out.println("Invalid entry.");
			}
			
//FIXME I need a way to determine the taxRate object before calling method to calculate (and print)
//and I will need to alter the calculate method to something simpler

		}
		
		
		
		
		scanner.close();
	}

}

/*
taxRate1.weeklyWitholdingCalc(incomeWeekly);
taxRate2.weeklyWitholdingCalc(incomeWeekly);
taxRate3.weeklyWitholdingCalc(incomeWeekly);
taxRate4.weeklyWitholdingCalc(incomeWeekly);

taxRate1.printResult();
taxRate2.printResult();
taxRate3.printResult();
taxRate4.printResult();
*/