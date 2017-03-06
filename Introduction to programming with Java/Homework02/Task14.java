import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = sc.nextInt();
		
		sc. close();
		
		printInt(num);
	}
	static void printInt(int num){
	
		if(!isInRange(num)){
			System.out.println("The integer must be between 10 and 200.");
			System.exit(1);
		}
		
		for(int i = num; i >= 7; i --){
			if(i % 7 == 0)
				System.out.print(i + " ");
		}
	}
	static boolean isInRange(int num){
		return num >= 10 && num <= 200;
	}
}
