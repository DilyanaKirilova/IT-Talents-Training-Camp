import java.util.Scanner;

public class Task18 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num1 = sc.nextInt();
		System.out.print("Enter an integer: ");
		int num2 = sc.nextInt();
		
		sc. close();
		
		printTable(num1, num2);
	}
	
	static boolean isInRange(int num){
		return num > 0 && num < 10;
	}
	
	static void printTable(int num1, int num2){
		
		if(!isInRange(num1) || !isInRange(num2)){
			System.out.println("Numbers are not in range.");
			System.exit(1);
		}
		
		for(int i = 1; i <= num1; i++){
			for(int j = 1; j <= num2; j++){
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}
}
