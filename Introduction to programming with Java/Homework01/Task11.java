import java.util.Scanner;

public class Task11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 100 and 999: ");
		short num = sc.nextShort();

		System.out.println(digitDiv(num));
		
		sc.close();
		
	}
	static boolean isInRange(short num){
		return num >= 100 && num < 1000;
	}
	
	static boolean digitDiv(short num){
		
		if(!isInRange(num)){
			System.out.println("The number is not in range.");
			System.exit(1);
		}
		
		for(short i = 0; i < 3; i++){
			short rest = (byte)(num % 10);
			
			if(rest == 0){
				System.out.println("Error: zero division.");
				System.exit(1);
			}
			
			if(num % rest != 0){
				return false;
			}
			num /= 10;
		}
		return true;
	}
}
