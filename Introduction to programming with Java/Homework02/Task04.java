
public class Task04 {
	public static void main(String[] args) {
		
		int floor = 1;
		int ceiling = 10;
		
		printInt(floor, ceiling);
	}
	static void printInt(int floor, int ceiling){
		
		for(int i = ceiling; i >= floor; i--){
			System.out.print(i + " ");
		}
	}
}
