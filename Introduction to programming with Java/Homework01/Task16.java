import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 100 and 999: ");
		short num = sc.nextShort();
		
		sc.close();
		
		if(!isInRange(num)){
			System.out.println("The number is not in range.");
			System.exit(1);
		}
		
		short c = (byte) (num % 10);
		num /= 10;
		short b = (byte) (num % 10);
		num /= 10;
		short a = (byte) (num % 10);
		
		if(a == b && a == c){
			System.out.println("The digits are equal.");
		}
		else if(a < b && b < c){
			System.out.println("The digits are in increasing order.");
		}
		else if(a > b && b > c){
			System.out.println("The digits are in decreasing order.");
		}
		else{
			System.out.println("The digits are unordered.");
		}
	}
	static boolean isInRange(short num){
		return num >= 100 && num < 1000;
	}
}
