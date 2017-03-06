import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a set:");
		System.out.print("Enter a number between 1 and 8: ");
		short x1 = sc.nextShort();
		System.out.print("Enter a number between 1 and 8: ");
		short y1 = sc.nextShort();
		
		System.out.println("Enter another set:");
		System.out.print("Enter a number between 1 and 8: ");
		short x2 = sc.nextShort();
		System.out.print("Enter a number between 1 and 8: ");
		short y2 = sc.nextShort();
		
		sc.close();
		
		if(!(isInRange(x1) && isInRange(y1) && isInRange(y2) && isInRange(y2))){
			System.out.println("The coordinats are not in range.");
			System.exit(1);
		}
		
		if((isEvenSet(x1, y1) || isOddSet(x1, y1)) && 
				(isEvenSet(x2, y2) || isOddSet(x2, y2))){
			System.out.println("The positions are in the same colour.");
		}
		else{
			System.out.println("The positions are in different colours.");
		}
	}
	static boolean isInRange(short num){
		return num >= 1 && num <= 8;
	}
	
	static boolean isEvenSet(short x, short y){
		return (x % 2 == 0 && y % 2 == 0);
	}
	
	static boolean isOddSet(short x, short y){
		return (x % 2 != 0 && y % 2 != 0);
	}
}
