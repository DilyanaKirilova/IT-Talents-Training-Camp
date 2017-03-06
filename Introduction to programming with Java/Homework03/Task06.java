import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int len;
		
		do{
			System.out.print("Enter the length of the array: ");
			len = sc.nextInt();
		}
		while(len <= 0);
		
		int[] first = new int[len];
		
		for(int i = 0; i < first.length; i++){
			System.out.print("arr[" + i + "] = ");
			first[i] = sc.nextInt();
		}
		
		len = 0;
		
		do{
			System.out.print("Enter the length of the array: ");
			len = sc.nextInt();
		}
		while(len <= 0);
		
		int[] second = new int[len];
		
		for(int i = 0; i < second.length; i++){
			System.out.print("arr[" + i + "] = ");
			second[i] = sc.nextInt();
		}
		
		if(first.length != second.length){
			System.out.println("Arrays are NOT equal.");
			System.out.println("Lengths are NOT equal.");
		}
		else{
			System.out.println("Lengths are equal.");
			for(int i = 0; i < first.length; i++){
				if(first[i] != second[i]){
					System.out.println("Arrays are NOT equal.");
					break;
				}
				System.out.println("Arrays are equal.");
			}
		}
		
		sc.close();
	}
}
