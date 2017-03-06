import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int len;
		
		do{
			System.out.print("Enter the length of the array: ");
			len = sc.nextInt();
		}
		while(len <= 0);
		
		int[] arr = new int[len];
		int[] newArr = new int[len];
		
		int end = len - 1;
		int input;
		
		for(int i = 0; i < arr.length; i++){
			System.out.print("arr[" + i + "] = ");
			input =  sc.nextInt();
			arr[i] = input;
			if(i >= len / 2){
				newArr[end] = input;
				end--;
			}
			else{
				newArr[i] = input;
			}
		}
		
		for(int i = 0; i < newArr.length; i++){
			System.out.print(newArr[i] + " ");
		}
		
		sc.close();
	}
}
