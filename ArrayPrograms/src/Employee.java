import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[5];
		for(int i = 0; i<= arr.length-1; i++) {
			System.out.println("Eneter the first name of Employee " + i );
			arr[i] = sc.next();
			
		}
		for(int i =0;i<= arr.length- 1;i++) {
			System.out.println(arr[i]);
		}
	}
}
