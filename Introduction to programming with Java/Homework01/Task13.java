import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between -100 and 100: ");
		short temp = sc.nextShort();
		
		sc.close();
		
		if(!isInRange(temp)){
			System.out.println("The temperature is not in range.");
			System.exit(1);
		}	
		
		if(temp > 25){
			System.out.println("Hot");
		}
		else if(temp > 15 && temp <= 25){
			System.out.println("Warm");
		}
		else if(temp > 0 && temp <= 15){
			System.out.println("Chilly");
		}
		else if(temp > -20 && temp <= 0){
			System.out.println("Cold");
		}
		else{
			System.out.println("Icily");
		}
	}
	
	static boolean isInRange(short num){
		return num >= -100 && num <= 100;
	}
}
