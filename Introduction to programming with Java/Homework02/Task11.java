import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = sc.nextInt();
		
		sc.close();
		
		printTriangle(num);
		printBlankTriangle(num);
	}
	
	static void printTriangle(int n){
		
		int stars = 1;
		int spaces =  n - 1;
		
		for(int i = 0; i < n; i++){
			
			for(int j = 0; j < spaces; j ++){
				
				System.out.print(" ");
			}
			spaces--;
			
			for(int k = 0; k < stars; k++){
				
				System.out.print("*");	
			}
			stars += 2;
			
			System.out.println();
		}
	}
	
static void printBlankTriangle(int n){
		
		int stars = 1;
		int spaces =  n;
		
		for(int i = 0; i < n - 1; i++){
			
			for(int j = 0; j < spaces - 1; j ++){
				
				System.out.print(" ");
			}
			spaces--;
			
			if(i == 0){
				System.out.println("*");
				continue;
			}
			
			System.out.print("*");
			for(int k = 0; k < stars; k++){
			
				System.out.print(" ");	
			}
			
			System.out.print("*");
			stars += 2;
			
			System.out.println();
		}
		stars +=2;
		for(int i = 0; i < stars; i++){
			
			System.out.print("*");	
		}
	}
}
