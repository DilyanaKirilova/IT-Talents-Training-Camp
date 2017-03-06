import java.util.Scanner;

public class Task08 {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 1000 and 9999: ");
		short num = sc.nextShort();
		
		if(!isInRange(num)){
			System.out.println("The number is not in range.");
			System.exit(1);
		}
		byte thousandths = (byte) (num % 10);
		num /= 10;
		byte hundreds = (byte) (num % 10);
		num /= 10;
		byte tenths = (byte) (num % 10);
		num /= 10;
		byte units = (byte) (num % 10);
		num /= 10;
		
		byte num1 = (byte) (10 * units + thousandths);
		byte num2 = (byte) (10 * tenths + hundreds);
		
		if(num1 == num2){
			System.out.println(num1 + " = " + num2);
		}
		else if(num1 < num2)
		{
			System.out.println(num1 + " < " + num2);
		}
		else
		{
			System.out.println(num1 + " > " + num2);
		}
		sc.close();
	}
	
	static boolean isInRange(short num){
		return num >= 1000 && num < 10000;
	}
}
