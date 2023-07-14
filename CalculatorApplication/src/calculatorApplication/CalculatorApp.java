package calculatorApplication;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello User!.. Welcome to Kodnest Calculator");
		userInfo();
		boolean stop = true;
		while(true) {
		char ch = scan.next().charAt(0);
		if(ch == '+') {
			System.out.println("Enter two number");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int res1 = Calculator.addition(num1,num2);
			System.out.println("==> Addition of " + num1 + " and " + num2 +" is "+ res1 + "\n");
			userInfo();
		}
		if(ch == '-') {
			System.out.println("Enter two number");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int res2 = Calculator.subtraction(num1, num2);
			System.out.println("==> Subtraction of " + num1 + " and " + num2 +" is "+ res2 + "\n");
			userInfo();
		}
		if(ch == '*') {
			System.out.println("Enter two number");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int res3 = Calculator.multiplication(num1,num2);
			System.out.println("==> Multiplication of " + num1 + " and " + num2 +" is "+ res3 + "\n");
			userInfo();
		}
		if(ch == '/') {
			System.out.println("Enter two number");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int res4 = Calculator.division(num1,num2);
			System.out.println("==> Division of " + num1 + " and " + num2 +" is "+ res4 + "\n");
			userInfo();
		}
		if(ch == '%') {
			System.out.println("Enter two number");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int res5 = Calculator.remainder(num1,num2);
			System.out.println("==> Modulus of " + num1 + " and " + num2 +" is "+ res5 + "\n");
			userInfo();
		}
		if(ch == '!') {
			stop = false;
			System.out.println("Thank you");
			return;
		}
	}
		
		
	}
	public static void userInfo() {
		System.out.println(" + ------> Addition ");
		System.out.println(" - ------> Subtraction ");
		System.out.println(" * ------> Multiplication ");
		System.out.println(" + ------> Division ");
		System.out.println(" + ------> Remainder ");
		System.out.println(" ! ------> Stop Execution\n");
		System.out.println(" User.. Select your Choice");
					
	}
		
}
