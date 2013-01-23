import java.util.Random;

public class TastebudStylist extends Employee {
	
	public TastebudStylist(int salary) {
		super(salary);
	}
	
	public void work() {
		makeShake();
	}
	
	private void makeShake() {
		Random r = new Random();
		int randomInt = r.nextInt(100);
		
		if(randomInt > 10) {
			addEffectiveness(0.1f);
		} else {
			resetEffectiveness();
		}
	}
	
	public String title() {
		return "Tastebud Stylist";
	}
	
}