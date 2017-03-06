import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		
		System.out.println(multiplyWithAddition(num1, num2));
		
		sc.close();
	}
	
	static long multiplyWithAddition(int num1, int num2){
		
		if(num1 == 0 || num2 == 0){
			return 0;
		}
		
		if(num1 < 0 && num2 < 0){
			num1 = Math.abs(num1);
			num2 = Math.abs(num2);
		}
		else if(num1 < 0 && num2 > 0){
			num1 = Math.abs(num1);
			num2 = 0 - num2;
		}
		
		if(num1 == 1 || num2 == 1){
			return num1 == 1? (long)num2: (long)num1;
		}
		
		int sum = num2;
		if(num1 == 2){
			return sum + num2;
		}
		
		return sum + multiplyWithAddition(num1 - 1, num2);
		
	}
}
