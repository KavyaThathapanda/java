
public class JourneyCalculatorApp {

	public static void main(String[] args) {
		
		double res = calculateDistance(60.00, 1.5);
		System.out.printf("%.2f",res);
	}
		public static double calculateDistance(double speed, double time) {
		
		return speed * time;
		
	}
}
