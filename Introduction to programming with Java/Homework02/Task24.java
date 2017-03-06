import java.util.Scanner;

public class Task24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 10 and 30000: ");
		long num = sc.nextLong();
		
		sc.close();
		
		System.out.println(isPanlindrom(num));
	}
	static boolean isPanlindrom(long num)
	{
		if(!isInRange(num)){
			System.out.println("The number must be between 10 and 30000.");
			System.exit(1);
		}
		
		long temp = num;
		temp = reverseNum(temp);
		
		return temp == num;
	}
	
	static long reverseNum(long num){
		
		long result = 0;
		
		do{
			result *= 10;
			result += num % 10;
			num /=10;
		}
		while(num > 0);
		
		return result;
	}
	
	static boolean isInRange(long num){
		return num >= 10 && num <= 30000;
	}
}
