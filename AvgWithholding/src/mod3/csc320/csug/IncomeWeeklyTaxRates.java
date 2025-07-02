package mod3.csc320.csug;

public class IncomeWeeklyTaxRates {
	private double cuttoffForTaxRate;
	
	
	//constructor to initialize cuttoffForTaxRate for a specified level
	public IncomeWeeklyTaxRates(double incomeWeeklyCuttoffParam) {
		this.cuttoffForTaxRate = incomeWeeklyCuttoffParam;
	}
	
	//setter for cuttoffForTaxRate for a specified level
	public void setCuttoff(double incomeWeeklyCuttoffParam) {
		this.cuttoffForTaxRate = incomeWeeklyCuttoffParam;
	}
	
	//getter for cuttoffForTaxRate for a specified level
	public double getCuttoff() {
		return cuttoffForTaxRate;
	}
}
