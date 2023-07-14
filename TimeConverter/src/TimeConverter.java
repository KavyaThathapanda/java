
public class TimeConverter {

	public static double convertToHours(int minutes) {
		
		return minutes/60.0;
	}
	public static void main(String[] args) {
		
		System.out.println(convertToHours(90));
	}
}
