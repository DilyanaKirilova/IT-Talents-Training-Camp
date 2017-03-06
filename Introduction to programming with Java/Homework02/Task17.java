import java.util.Scanner;

public class Task17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer between 3 and 20: ");
		int side = sc.nextInt();
		System.out.print("Enter a symbol: ");
		char c = sc.next().charAt(0);
		
		sc.close();
		
		printSquare(side, c);
	}
	static boolean isInRange(int n){
		return n > 2 && n < 21;
	}
	static void printSquare(int side, char c ){
		
		if(!isInRange(side)){
			System.out.println("Integer must be between 3 and 20.");
			System.exit(1);
		}
		
		int symb = side - 2;
		for(int i = 0; i < side; i++){
			if(i == 0 || i == side - 1){
				for(int j = 0; j < side; j++)
					System.out.print("*");
				System.out.println();
			}
			else{
				System.out.print("*");
				for(int k = 0; k < symb; k++)
					System.out.print(c);
				System.out.print("*");
				System.out.println();
			}
		}
	}
}
