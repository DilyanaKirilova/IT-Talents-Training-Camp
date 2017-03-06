import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a position of fib number: ");
		int n = sc.nextInt();
		
		System.out.println(fib(n));
		
		sc.close();
	}
	
	static int fib(int n){
		
		if(n < 1){
			return -1;
		}
		
		if(n == 1 || n == 2){
			return 1;
		}
		
		return fib(n - 1) + fib(n - 2);
	}
}
