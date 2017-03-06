import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int len;
		
		do{
			System.out.print("Enter the length of the array: ");
			len = sc.nextInt();
		}
		while(len <= 0);
		
		int[] arr = new int[len];
		
		for(int i = 0; i < arr.length; i++){
			System.out.print("arr[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		
		int min  = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % 3 == 0 && arr[i] < min){
				min = arr[i];
			}
		}
		
		if(min % 3 == 0){
			System.out.println("The lowest number divisible by 3 in the array is: " + min);
		}
		else{
			System.out.println("There is no number divisible by 3 in the array.");
		}
		
		sc.close();
	}
}
