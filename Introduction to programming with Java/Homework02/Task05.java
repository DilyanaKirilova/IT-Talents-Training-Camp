import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Define an interval:");
		System.out.print("Enter the floor: ");
		int floor = sc.nextInt();
		System.out.print("Enter the ceiling: ");
		int ceiling = sc.nextInt();
		
		sc.close();
		
		printInt(floor, ceiling);
	}
	static void printInt(int floor, int ceiling){
		if(!isInterval(floor, ceiling)){
			System.out.println("Invalid interval.");
			System.exit(1);
		}
		
		for(int i = floor; i <= ceiling; i++){
			System.out.print(i + " ");
		}
	}
	
	static boolean isInterval(int floor, int ceiling){
		return floor < ceiling;
	}
}
