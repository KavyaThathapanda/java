import java.util.Scanner;

public class GalaciticArithmetic {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("User! Please Enter 2 numbers");
		long a = scan.nextLong();
		long b= scan.nextLong();
		long result = galacticAddition(a,b);
		System.out.println(result);
		scan.close();
	}
	
	public static long galacticAddition(long num1, long num2) {
		
		return num1+ num2;
	}
}

