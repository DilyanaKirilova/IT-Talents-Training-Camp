import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		System.out.println(isPalindrom(num));	
		sc.close();
		
		String s = "";
	
	}
	
	static boolean isPalindrom(int num){
		
		num = Math.abs(num);
		
		if(num == 0){
			return true;
		}
		
		int temp = num;
		int length = 1;
		
		while(temp > 0){
			length *= 10;
			temp /= 10;
		}
		
		length /= 10;
		
		if(num % 10 != num / length){
			return false;
		}
		
		num -= (num / length) *length;
		num /= 10;
		
		return isPalindrom(num);
	}
}