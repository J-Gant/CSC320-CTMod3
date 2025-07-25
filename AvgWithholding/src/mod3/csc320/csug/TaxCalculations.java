package mod3.csc320.csug;

public class TaxCalculations {
	private double taxRate;
	private double withholding;
	

	// constructor allows creation/initialization of taxRate objects
	public TaxCalculations(double taxRateParam) {
		this.taxRate = taxRateParam;
	}

	// setter allows update to taxRate objects
	public void setTaxRate(double taxRateParam) {
		this.taxRate = taxRateParam;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void weeklyWithholdingCalc(double incomeWeeklyParam, double taxRateParam) {
		withholding = incomeWeeklyParam * taxRateParam;
	}
	
	public double getWithholding() {
		return withholding;
	}
	
	public void printResult() {
		 System.out.printf("Your tax rate is %.0f%%%n", (getTaxRate() * 100));
		 System.out.printf("$%.2f will be withheld per week.%n", withholding); 
	}
}
