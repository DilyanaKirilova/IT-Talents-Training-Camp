import java.util.Scanner;

public class Task17 {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		int len;
		
		do{
			System.out.print("Enter the length of the array: ");
			len = sc.nextInt();
		}
		while(len <= 0);
		
		int[] arr = new int[len];
		
		System.out.println("Fill in the array:");
		
		for(int i = 0; i < arr.length; i++){
			System.out.print("arr[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		
		if(len == 1){
			System.out.println("The array is zig zag");
			sc.close();
			return;
		}
		else if(len == 2){
			if(arr[0] < arr[1]){
				System.out.println("The array is zig zag");
			}
			else{
				System.out.println("The array is not zig zag");
			}
			sc.close();
			return;
		}
		for(int i = 1; i < arr.length - 1; i++){
			if(arr[i -1] > arr[i] || arr[i] < arr[i + 1]){
				System.out.println("The array is not zig zag");
				sc.close();
				return;
			}
		}
		
		System.out.println("The array is zig zag");
		sc.close();
	}
}
