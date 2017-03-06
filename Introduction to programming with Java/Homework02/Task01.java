
public class Task01 {
	public static void main(String[] args) {
		
		int floor = 1;
		int ceiling = 100;
		
		printInt(floor, ceiling);
	}
	static void printInt(int floor, int ceiling){
		
		for(int i = floor; i <= ceiling; i++){
			System.out.print(i + " ");
		}
	}
}
