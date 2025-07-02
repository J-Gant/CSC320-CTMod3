package mod3.csc320.csug;

import java.util.Scanner;

public class AvgWithholding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double incomeWeekly = 0.0;
		
		IncomeWeeklyTaxRates incomeWeeklyCuttoffForTaxRate1 = new IncomeWeeklyTaxRates(500.00);
		IncomeWeeklyTaxRates incomeWeeklyCuttoffForTaxRate2 = new IncomeWeeklyTaxRates(1500.00);
		IncomeWeeklyTaxRates incomeWeeklyCuttoffForTaxRate3 = new IncomeWeeklyTaxRates(2500.00);
		
		TaxCalculations taxRate1 = new TaxCalculations(0.1);
		TaxCalculations taxRate2 = new TaxCalculations(0.15);
		TaxCalculations taxRate3 = new TaxCalculations(0.2);
		TaxCalculations taxRate4 = new TaxCalculations(0.3);
	
		//main menu to enter administrator menu for updates or employee/user menu
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
	
			if (scanner.hasNextDouble()) {
				incomeWeekly = scanner.nextDouble();
			}
			else {
				System.out.println("Invalid entry.");
			}
		}
		
		//determine employee taxRate based on weekly income
		if (incomeWeekly < 500.00) {
			witholding = incomeWeeklyParam * getTaxRate();
		} else if (incomeWeeklyParam < 1500.00) {
			witholding = incomeWeeklyParam * getTaxRate();
		} else if (incomeWeeklyParam < 2500.00) {
			witholding = incomeWeeklyParam * getTaxRate();
		} else {
			witholding = incomeWeeklyParam * getTaxRate();
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