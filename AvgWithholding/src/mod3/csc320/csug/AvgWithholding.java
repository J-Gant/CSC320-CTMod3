package mod3.csc320.csug;

import java.io.File;
import java.io.PrintWriter;
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
		
		//load previously updated settings for taxRates and incomeWeeklyCuttoffs from file if
		//available and throws FileNotFoundException if not available
        try (Scanner fileScanner = new Scanner(new File("settings.txt"))) {
            taxRate1.setTaxRate(fileScanner.nextDouble());
            taxRate2.setTaxRate(fileScanner.nextDouble());
            taxRate3.setTaxRate(fileScanner.nextDouble());
            taxRate4.setTaxRate(fileScanner.nextDouble());
            incomeWeeklyCuttoffForTaxRate1.setCuttoff(fileScanner.nextDouble());
            incomeWeeklyCuttoffForTaxRate2.setCuttoff(fileScanner.nextDouble());
            incomeWeeklyCuttoffForTaxRate3.setCuttoff(fileScanner.nextDouble());
            System.out.println("Settings loaded from file.");
        }
        catch (Exception e) {
            System.out.println("No saved settings found. Using defaults.");
        }
	
		//main menu to enter administrator menu for updates or employee/user menu
		System.out.println("Please choose one of the following options:\n");
		System.out.println("For administrator options type \"A\"");
		System.out.println("For employee options type \"E\"");
		
		String mainMenuSelection = scanner.next();
		
		if (mainMenuSelection.equalsIgnoreCase("A")) {
			//branch goes to password protected admin menu
			System.out.println("Please enter an administrator password:");
			String password = scanner.next();
			if (password.equals("password")) {
				System.out.println();
				System.out.println("Please enter:\n");
				System.out.println("  \"1\" to update taxRate1.");
				System.out.println("  \"2\" to update taxRate2.");
				System.out.println("  \"3\" to update taxRate3.");
				System.out.println("  \"4\" to update taxRate4.\n");
				System.out.println("  \"5\" to update incomeWeeklyCuttoffForTaxRate1.");
				System.out.println("  \"6\" to update incomeWeeklyCuttoffForTaxRate2.");
				System.out.println("  \"7\" to update incomeWeeklyCuttoffForTaxRate3.");
				System.out.println();
			}
			else {
				System.out.println("Invalid entry.");
				System.exit(0);
			}
			if (scanner.hasNextInt()) {
				int input = scanner.nextInt();
				double caseX;
				switch(input) {
				case 1:
					System.out.println("Please provide a new taxRate1 as a fraction. (i.e. 0.xx):");
					caseX = scanner.nextDouble();
					taxRate1.setTaxRate(caseX);
					System.out.println("The new rate for taxRate1 is: " + taxRate1.getTaxRate());
					break;
				case 2:
					System.out.println("Please provide a new taxRate2 as a fraction. (i.e. 0.xx):");
					caseX = scanner.nextDouble();
					taxRate2.setTaxRate(caseX);
					System.out.println("The new rate for taxRate2 is: " + taxRate2.getTaxRate());
					break;
				case 3:
					System.out.println("Please provide a new taxRate3 as a fraction. (i.e. 0.xx):");
					caseX = scanner.nextDouble();
					taxRate3.setTaxRate(caseX);
					System.out.println("The new rate for taxRate3 is: " + taxRate3.getTaxRate());
					break;
				case 4:
					System.out.println("Please provide a new taxRate4 as a fraction. (i.e. 0.xx):");
					caseX = scanner.nextDouble();
					taxRate4.setTaxRate(caseX);
					System.out.println("The new rate for taxRate4 is: " + taxRate4.getTaxRate());
					break;
				case 5:
					System.out.println("Please provide a new incomeWeeklyCuttoffForTaxRate1.");
					caseX = scanner.nextDouble();
					incomeWeeklyCuttoffForTaxRate1.setCuttoff(caseX);
					System.out.println("The new incomeWeeklyCuttoffForTaxRate1 is: " 
							+ incomeWeeklyCuttoffForTaxRate1.getCuttoff());
					break;
				case 6:
					System.out.println("Please provide a new incomeWeeklyCuttoffForTaxRate2.");
					caseX = scanner.nextDouble();
					incomeWeeklyCuttoffForTaxRate2.setCuttoff(caseX);
					System.out.println("The new incomeWeeklyCuttoffForTaxRate2 is: " 
							+ incomeWeeklyCuttoffForTaxRate2.getCuttoff());
					break;
				case 7:
					System.out.println("Please provide a new incomeWeeklyCuttoffForTaxRate3.");
					caseX = scanner.nextDouble();
					incomeWeeklyCuttoffForTaxRate3.setCuttoff(caseX);
					System.out.println("The new incomeWeeklyCuttoffForTaxRate3 is: " 
							+ incomeWeeklyCuttoffForTaxRate3.getCuttoff());
					break;
				default:
					System.out.println("Invalid entry");
					System.exit(0);
				}
				//save settings after admin update
                saveSettingsToFile(taxRate1, taxRate2, taxRate3, taxRate4,
                        incomeWeeklyCuttoffForTaxRate1, incomeWeeklyCuttoffForTaxRate2,
                        incomeWeeklyCuttoffForTaxRate3);
                System.out.println("Settings saved.");
			}
			else {
				System.out.println("Invalid entry.");
				System.exit(0);
			}	
		}
		
		else if (mainMenuSelection.equalsIgnoreCase("E")) {
			//branch goes to employee menu
			System.out.println("To view your current tax rate and witholding "
				+ "please enter your weekly income.\n");
	
			if (scanner.hasNextDouble()) {
				incomeWeekly = scanner.nextDouble();
			}
			else {
				System.out.println("Invalid entry.");
			}
		
		//call for taxRate and weekly withholding based on incomeWeekly user input
			if (incomeWeekly < incomeWeeklyCuttoffForTaxRate1.getCuttoff()) {
				taxRate1.weeklyWithholdingCalc(incomeWeekly, taxRate1.getTaxRate());
				taxRate1.printResult();
			} else if (incomeWeekly < incomeWeeklyCuttoffForTaxRate2.getCuttoff()) {
				taxRate2.weeklyWithholdingCalc(incomeWeekly, taxRate2.getTaxRate());
				taxRate2.printResult();
			} else if (incomeWeekly < incomeWeeklyCuttoffForTaxRate3.getCuttoff()) {
				taxRate3.weeklyWithholdingCalc(incomeWeekly, taxRate3.getTaxRate());
				taxRate3.printResult();
			} else {
				taxRate4.weeklyWithholdingCalc(incomeWeekly, taxRate4.getTaxRate());
				taxRate4.printResult();
			}
		}
		
		scanner.close();
	}
	//helper method to save all settings to a file
    public static void saveSettingsToFile(
            TaxCalculations taxRate1, TaxCalculations taxRate2,
            TaxCalculations taxRate3, TaxCalculations taxRate4,
            IncomeWeeklyTaxRates cut1, IncomeWeeklyTaxRates cut2, IncomeWeeklyTaxRates cut3) {

        try (PrintWriter out = new PrintWriter("settings.txt")) {
            out.println(taxRate1.getTaxRate());
            out.println(taxRate2.getTaxRate());
            out.println(taxRate3.getTaxRate());
            out.println(taxRate4.getTaxRate());
            out.println(cut1.getCuttoff());
            out.println(cut2.getCuttoff());
            out.println(cut3.getCuttoff());
        } catch (Exception e) {
            System.out.println("Error saving settings: " + e.getMessage());
        }
    }//I has cheezburgurz
}
