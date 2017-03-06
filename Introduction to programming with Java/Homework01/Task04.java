import java.util.Scanner;

public class Task04 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		printIncreasing(num1, num2);
	}
	
	static void printIncreasing(int num1, int num2){
		
		if(num1 <= num2){
			System.out.println(num1 + " " + num2);
		}
		else{
			System.out.println(num2 + " " + num1);
		}
	}
}
