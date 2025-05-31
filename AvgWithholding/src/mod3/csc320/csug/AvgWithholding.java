package mod3.csc320.csug;

import java.util.Scanner;

public class AvgWithholding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double taxRate1 = 0.1;
		double taxRate2 = 0.15;
		double taxRate3 = 0.2;
		double taxRate4 = 0.3;
		double incomeWeekly = 0.0;
		double witholding = 0.0;
		
		System.out.println("Please enter your weekly income.");
		
		if (scanner.hasNextDouble()) {
			incomeWeekly = scanner.nextDouble();
		}
		else {
			System.out.println("Invalid entry.");
		}
		
		if (incomeWeekly < 500.00) {
			witholding = incomeWeekly * taxRate1;
			System.out.println("Your tax rate is 10%");
			System.out.printf("$%.2f will be withheld per week.", witholding);
		}
		else if (incomeWeekly < 1500.00) {
			witholding = incomeWeekly * taxRate2;
			System.out.println("Your tax rate is 15%");
			System.out.printf("$%.2f will be withheld per week.", witholding);
		}
		else if (incomeWeekly < 2500.00) {
			witholding = incomeWeekly * taxRate3;
			System.out.println("Your tax rate is 20%");
			System.out.printf("$%.2f will be withheld per week.", witholding);
		}
		else {
			witholding = incomeWeekly * taxRate4;
			System.out.println("Your tax rate is 30%");
			System.out.printf("$%.2f will be withheld per week.", witholding);
		}
		

	}

}
