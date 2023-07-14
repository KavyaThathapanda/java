import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();
		String res = joinStrings(str1,str2);
		System.out.println(res);
		scan.close();
	}
	
	public static String joinStrings(String str1, String str2) {
		
		String a = str1 + " " + str2;
		return a;
	}
}
