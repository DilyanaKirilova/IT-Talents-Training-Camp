import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num = sc.nextInt();
		
		sc.close();
		
		System.out.println(sum(num));
		
	}
	static int sum(int num){
		
		if(num <= 0){
			System.out.println("The number can not be negative.");
			System.exit(1);
		}
		return (num * (num + 1)) / 2 ;
	}
}
