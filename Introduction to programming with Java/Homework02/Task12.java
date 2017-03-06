
public class Task12 {
	public static void main(String[] args) {
		
	int floor = 100;
	int ceiling = 1000;
	
	printInt(floor, ceiling);
	}
	
	static void printInt(int floor, int ceiling){
	 
		int hundreds = 0;
		int tenths = 0;
		int units = 0;
		int temp = 0;
		for(int i = floor; i <= ceiling; i ++){
			temp = i;
			hundreds = temp % 10;
			temp /= 10;
			tenths = temp % 10;
			temp /= 10;
			units = temp % 10;
			if(units == tenths || units == hundreds || tenths == hundreds)
				continue;
			System.out.print(i + " ");
		}
	}
}
