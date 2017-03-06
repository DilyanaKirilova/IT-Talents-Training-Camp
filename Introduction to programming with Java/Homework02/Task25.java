import java.util.Scanner;

public class Task25 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		long num = sc.nextLong();
		
		sc.close();
		
		System.out.println(factorial(num));
	}
	static long factorial(long num){
		
		if(num < 0){
			System.out.println("The number can not be negative.");
			System.exit(1);
		}
		long result = 1;
		do{
			result *= num--;
		}
		while(num > 1);
		return result;
	}
}
