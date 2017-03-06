import java.util.Scanner;

public class Task08 {
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
		
		int beg = 0,
			end = 0;
		for(int i = 0; i < arr.length - 1; i++){
			if(arr[i] == arr[i + 1]){
				for(int j = i; j < arr.length - 1; j++){
					if(arr[j] != arr[j + 1]){
						if(j - i > end - beg){
							beg = i;
							end = j;
						}
						break;
					}
				}
			}
		}
		
		for(int i = beg; i <= end; i++){
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
