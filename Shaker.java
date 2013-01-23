public class Shaker extends Employee {
	
	public Shaker(int salary) {
		super(salary);
	}
	
	public void work() {
		shake();
	}
	
	public void shake() {
		addEffectiveness(0.02);
	}
	
	public String title() {
		return "Shaker";
	}
	
}