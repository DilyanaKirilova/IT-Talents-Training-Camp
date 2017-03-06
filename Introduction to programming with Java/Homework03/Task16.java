import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[10];
		
		for(int i = 0; i < arr.length; i++){
			System.out.print("arr[" + i + "] = ");
			arr[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < -0.231){
				arr[i] = (i + 1) * (i + 1) + 41.25;
			}
			else{
				arr[i] = arr[i] * (i + 1);
			}
		}
		
		System.out.println();
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
