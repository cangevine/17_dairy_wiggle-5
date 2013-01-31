import java.util.Random;
// @BC: Beautifully done, Max!
public class Moover extends Employee {
	
	public Moover(int salary) {
		super(salary);
	}
	
	public void work() {
		takeOrder();
		deliverShake();
	}
	
	public void takeOrder() {
		Random r = new Random();
		int randomInt = r.nextInt(100);
		
		if(randomInt > 20) {
			addEffectiveness(0.05);
		} else {
			addEffectiveness(-0.1);
		}
	}
	
	public void deliverShake() {
		Random r = new Random();
		int randomInt = r.nextInt(100);
		
		if (randomInt > 5) {
			addEffectiveness(0.03);
		} else {
			addEffectiveness(-0.1);
		}
	}
	
	public String title() {
		return "Mover";
	}
	
}