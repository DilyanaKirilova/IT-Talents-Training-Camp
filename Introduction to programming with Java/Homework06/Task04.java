import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		do{
			System.out.print("Enter the first number: ");
			num1 = sc.nextInt();
			System.out.print("Enter the second number: ");
			num2 = sc.nextInt();
		}
		while(num1 > num2);
		
		
		printRectangle(num1, num1, num2);
		
		sc.close();
	}
	
	
	static void printRectangle(int num1, int copyNum1, int num2){
		
		if(copyNum1 > num2){
			return;
		}
		
		for(int i = num1; i <= copyNum1; i++){
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		printRectangle(num1, copyNum1 + 1, num2);
	}
}
