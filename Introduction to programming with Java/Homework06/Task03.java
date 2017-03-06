import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		System.out.println(isPrime(num, 2));	
		sc.close();
	}
	
	static boolean isPrime(int num, int i){
		
		if(num < 0 || num != 2 && num % i++ == 0){
			return false;
		}
		
		if(i >= num){
			return true;
		}
		
		return isPrime(num, i++);
	}
}
