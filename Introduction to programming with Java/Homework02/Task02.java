
public class Task02 {
	public static void main(String[] args) {
		
		int floor = -20;
		int ceiling = 50;
		
		printInt(floor, ceiling);
	}
	static void printInt(int floor, int ceiling){
		
		for(int i = floor; i <= ceiling; i++){
			System.out.print(i + " ");
		}
	}
}
