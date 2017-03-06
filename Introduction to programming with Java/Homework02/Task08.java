import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num = sc.nextInt();
		
		sc.close();
		
		printInt(num);
	}
	static void printInt(int n){
		
		int beg = n - 1;
	
		for(int i = 0; i < n ; i++){
			for(int j = 0; j < n; j++){
				System.out.print(beg);
			}
			beg +=2;
			System.out.println();
		}
	}
}
