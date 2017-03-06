import java.util.Scanner;
public class Task05 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter the third number: ");
		int num3 = sc.nextInt();
		
		sc.close();
		
		printDecreasing(num1, num2, num3);
	}
	
	static void printDecreasing(int num1, int num2, int num3){
		
		int temp = 0;
		if(num1 < num2){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		if(num2 < num3){
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		if(num1 < num2){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
			System.out.println(num1 + " " + num2 + " " + num3);
	}
}
	