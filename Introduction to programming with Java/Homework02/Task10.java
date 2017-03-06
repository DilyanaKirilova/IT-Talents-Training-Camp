import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num = sc.nextInt();
		
		sc.close();
		
		System.out.println(isPrime(num));
	}
	
	static boolean isPrime(int num){
		
		for(int i = 2; i <= Math.sqrt(num); i ++){
			if(num % i  == 0)
				return false;
		}
		return true;
	}
}
