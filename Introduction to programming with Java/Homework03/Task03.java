import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		int[]arr = new int[10];
		
		arr[0] = num;
		arr[1] = num;
		
		for(int i = 2; i < arr.length; i++){
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}
}
