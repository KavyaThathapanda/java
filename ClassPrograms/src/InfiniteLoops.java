
public class InfiniteLoops {

	public static void main(String[] args) {
		int i = 1;
		for(; ;) {
			if(i%2 == 0) {
			System.out.println(i);
			}i++;
		}
	}
}
