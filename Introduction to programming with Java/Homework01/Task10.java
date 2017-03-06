import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 10 and 9999: ");
		short num = sc.nextShort();

		sc.close();
		
		if(!isInRange(num)){
			System.out.println("The number is not in range.");
			System.exit(1);
		}
		
		short rest = (short) (num % 5);
		short buckets = (short) (num / 5);
		
		System.out.println(buckets + " x 2L bucket.");
		System.out.println(buckets + " x 3L bucket.");
		
		if(rest == 4){
			System.out.println("One more 2L bucket.");
			System.out.println("One more 3L bucket.");
		}
		else if(rest == 3)
		{
			System.out.println("One more 3L bucket.");
		}
		else if(rest == 2 || rest == 1){
			System.out.println("One more 2L bucket.");
		}
		
	}
	static boolean isInRange(short num){
		return num >= 10 && num < 10000;
	}
}
