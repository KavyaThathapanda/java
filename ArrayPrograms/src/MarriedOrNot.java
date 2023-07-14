import java.util.Scanner;

public class MarriedOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Person");
		int N = sc.nextInt();
		Boolean arr[] = new Boolean[N];
		for(int i = 0 ; i <= arr.length-1 ; i++) {
			System.out.println("User..Please Enter True or False if the person " + i + " is married or not!!");
			arr[i] = sc.nextBoolean(); 
		}
		
		for(int i = 0; i<= arr.length-1;i++) {
			System.out.println("Person " + i + " is Married = " + arr[i]);
		}

	}

}
