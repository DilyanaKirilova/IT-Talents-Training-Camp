import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num = sc.nextInt();
		
		sc.close();
		
		printInt(num);
	}
static void printInt(int n){

	for(int i = 3; i <= n * 3; i+=3){
		System.out.print(i + " ");
	}
}
}