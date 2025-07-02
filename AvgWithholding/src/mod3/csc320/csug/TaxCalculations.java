package mod3.csc320.csug;

public class TaxCalculations {
	private double taxRate;
	private double witholding;
	

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

	public void weeklyWitholdingCalc(double incomeWeeklyParam) {

	}
	
	public double getWitholding() {
		return witholding;
	}
	
	public void printResult() {
		 System.out.printf("Your tax rate is %.0f%%%n", (getTaxRate() * 100));
		 System.out.printf("$%.2f will be withheld per week.%n", getWitholding()); 
	}
}

/*
System.out.println("Your tax rate is 15%");
System.out.printf("$%.2f will be withheld per week.", witholding); 

System.out.println("Your tax rate is 20%");
System.out.printf("$%.2f will be withheld per week.", witholding); 

System.out.println("Your tax rate is 30%");
System.out.printf("$%.2f will be withheld per week.", witholding); 
*/