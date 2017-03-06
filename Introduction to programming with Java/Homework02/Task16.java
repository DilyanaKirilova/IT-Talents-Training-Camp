import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the floor: ");
		int floor = sc.nextInt();
		System.out.print("Enter the ceiling: ");
		int ceiling = sc.nextInt();
		
		sc. close();
		
		printInt(floor, ceiling);
	}
	static void printInt(int floor, int ceiling){
		
		if(!isInRange(floor) || !isInRange(ceiling) || !isInterval(floor, ceiling)){
			System.out.println("Invalid data.");
			System.exit(1);
		}
		
		int start = 0;

		for(int i = ceiling; i >= floor; i --){
			if(i % 50 == 0){
				start = i;
				break;
			}
		}
		
		for(int j = start; j >= 50; j -= 50){
			System.out.println(j + " ");
		}
	}
	static boolean isInRange(int num){
		return num >= 10 && num <= 5555;
	}
	
	static boolean isInterval(int floor, int ceiling){
		return floor < ceiling;
	}
}
