import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		float [][]arr = new float[4][3];
		
		for(int i=0;i<=arr.length -1;i++) {
			
			for(int j=0;j<=arr[i].length -1;j++) {
				
				System.out.println("Enter the height of Game " + i + " and Player " + j);
				arr[i][j] = scan.nextFloat();
	
			}
			
		}
		for(int i=0;i<=arr.length -1;i++) {
			
			for(int j=0;j<=arr[i].length -1;j++) {
				
				System.out.println("The Height of Player " + j + " in the Game " + i + " is " + arr[i][j]);
			}
			System.out.println();
		}

	}

}
