
public class Task03 {
	public static void main(String[] args) {
		
		int floor = -10;
		int ceiling = 10;
		
		printInt(floor, ceiling);
	}
	static void printInt(int floor, int ceiling){
		for(int i = floor + 1; i < ceiling; i+=2){
			System.out.print(i + " ");
		}
	}
}
