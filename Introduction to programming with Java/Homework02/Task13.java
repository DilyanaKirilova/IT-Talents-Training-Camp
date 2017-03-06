import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {
		int floor = 100;
		int ceiling = 1000;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int sum = sc.nextInt();
		
		sc. close();
		printInt(floor, ceiling, sum);
		}
	
	static void printInt(int floor, int ceiling, int sum){
	 
		if(!isInRange(sum)){
			System.out.println("The integer must be between 2 and 27.");
			System.exit(1);
		}
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
			if(units + tenths + hundreds == sum)
				System.out.print(i + " ");
		}
	}
	static boolean isInRange(int num){
		return num > 1 && num < 28;
	}
}
		