import java.util.Scanner;

public class Task22 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = sc.nextInt();
		
		printInt(num);
		sc.close();
		
	}
		static void printInt(int num){
			
			int i = 1;
			while(i <= 10){
				num++;
				if(num % 2 == 0 || num % 3 == 0 || num% 5 == 0){
					System.out.print(i + ":" + num + "; ");
					i++;
				}
			}
		}
}
