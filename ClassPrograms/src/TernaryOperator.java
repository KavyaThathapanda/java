import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total grade point"); 
		int grade = sc.nextInt();
		String msg = (grade > 8? "Excellent" : grade <=  8 && grade >= 7 ? "Very Good" : "Good");
		System.out.println(msg);
	}
}
