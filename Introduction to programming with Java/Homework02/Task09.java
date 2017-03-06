import java.util.Scanner;

public class Task09 {
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
		
		int sum = 0;
		
		for(int i = floor; i <= ceiling; i ++){
			
			sum += i;
			
			if(sum > 200){
				System.out.println("Sum is greater than 200.");
				break;
			}
			
			if(i % 3 == 0){
				System.out.println("Skip 3");
				continue;
			}
			
			System.out.print(i * i + ", ");
		}
	}
	
	static boolean isInterval(int floor, int ceiling){
		return floor < ceiling;
	}
}
