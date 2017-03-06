import java.util.Scanner;

public class Task09 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 10 and 99: ");
		short num1 = sc.nextShort();
		System.out.print("Enter a number between 10 and 99: ");
		short num2 = sc.nextShort();
		
		sc.close();
		
		if(!(isInRange(num1) && isInRange(num2))){
			System.out.println("The numbers are not in range.");
			System.exit(1);
		}
		
		int multipl = num1 * num2;
		
		if((multipl % 10) % 2 == 0)
		{
			System.out.println(multipl + ", " + (multipl % 10) + " is even.");
		}
		else{
			System.out.println(multipl + ", " + (multipl % 10) + " is odd.");
		}
	}
	static boolean isInRange(short num){
		return num >= 10 && num < 100;
	}
}
