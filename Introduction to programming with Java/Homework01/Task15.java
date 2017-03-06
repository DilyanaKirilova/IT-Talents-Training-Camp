import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a hour between 0 and 24: ");
		short hour = sc.nextShort();
		
		sc.close();
		
		if(!isInRange(hour)){
			System.out.println("The entered hour is not in range.");
			System.exit(1);
		}
		
		if(hour > 8 && hour < 19){
			System.out.println("Good afternoon!");
		}
		else if(hour > 3){
			if(hour < 10){
				System.out.println("Good morning!");
			}
			if(hour < 18){
				System.out.println("Good evening!");
			}
		}
		else{
			System.out.println("Hello!");
		}
	
	}
	static boolean isInRange(short num){
		return num >= 0 && num < 25;
	}
}
