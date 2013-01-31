import java.util.Random;

public class Simulator {
	
	private Employee[] employees;
	
	public static void main(String[] args) {
		Simulator s = new Simulator();
		s.run();
	}
	
	public Simulator() {
		employees = new Employee[6];
		
		for (int i=0; i<6; i++) {
			if(i < 2) {
				employees[i] = new TastebudStylist(530);
			} else if (i < 4) {
				employees[i] = new Moover(480);
			} else if (i < 6) {
				employees[i] = new Shaker(430);
			}
		}
	}
	// @BC: Wonderfully organized and clear code, Max. The comments are helpful too.
	public void run() {
		// @BC: A great touch!
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
		
		for (int m=0; m<6; m++) {
			// Each month
		
			System.out.println("\n\n===== " + months[m] + " =====");
			
			for (int w=0; w<4; w++) {
				// Each Week
			
				System.out.println("\nWeek " + (w+1) + ":\n");
				
				for (Employee employee : employees) {
					employee.resetEffectiveness();
				}
				
				for (int d=0; d<5; d++) {
					// Each day
					
					for (Employee employee : employees) {
						employee.work();
					}
				}
				
				for (Employee employee : employees) {
					employee.earnPaycheck();
					
					System.out.println(employee);
				}
			}
			
			// Line dancing competish
			
			Random r = new Random();
			int person = r.nextInt(6);
			int amount = 100 + r.nextInt(100);
			
			employees[person].earnBonus(amount);
			
			System.out.println("\nWinner of the line-dancing competish ($" + amount + "):");
			System.out.println(employees[person]);
		}
	}
	
}