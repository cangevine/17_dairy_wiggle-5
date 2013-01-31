// @BC: Well organized, neat classes all around. Great work, Max.
public abstract class Employee {

	private double effectivenessMultiplier;
	private int baseWeeklySalary;
	private int totalPaymentToDate;
	
	public abstract void work();
	// @BC: Only a stylistic recommendation -- 'title' sounds more like a field than a method
	public abstract String title();
	
	public Employee(int salary) {
		resetEffectiveness();
		totalPaymentToDate = 0;
		baseWeeklySalary = salary;
	}
	
	public void earnPaycheck() {
		totalPaymentToDate += (baseWeeklySalary * effectivenessMultiplier);
	}
	
	public void earnBonus(int amount) {
		totalPaymentToDate += amount;
	}
	
	public String toString() {
		return title() + " => $" + totalPaymentToDate + " (Effectiveness: " + effectivenessMultiplier + ")";
	}
	
	public double getEffectivenessMultiplier() {
		return effectivenessMultiplier;
	}
	
	public void setEffectivenessMultiplier(double n) {
		effectivenessMultiplier = n;
	}
	
	public void addEffectiveness(double a) {
		effectivenessMultiplier += a;
	}
	
	public void resetEffectiveness() {
		effectivenessMultiplier = 1.0;
	}
	
	public int getBaseWeeklySalary() {
		return baseWeeklySalary;
	}
	
	public void setBaseWeeklySalary(int n) {
		baseWeeklySalary = n;
	}
	
	public int getTotalPaymentToDate() {
		return totalPaymentToDate;
	}
	
	public void setTotalPaymentToDate(int n) {
		totalPaymentToDate = n;
	}
	
}