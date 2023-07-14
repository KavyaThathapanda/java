
import java.util.*;
	
public class PerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length");
		int length = scanner.nextInt();
		System.out.println("Enter breadth");
		int breadth = scanner.nextInt();
		System.out.println("Enter height");
		int height = scanner.nextInt();
		rectangle(length,breadth,height);
		
	}
	public static void rectangle(int x, int y, int z) {
		 int res = x*y*z;
		 System.out.println(res);
	}
	

}
