import java.util.Scanner;

public class Task18 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int len;
		
		do{
			System.out.print("Enter the length of the array: ");
			len = sc.nextInt();
		}
		while(len <= 0);
		
		int[] first = new int[len];
		int[] second = new int[len];
		int[] maxValues = new int[len];
		
		System.out.println();
		System.out.println("Fill in the first array:");
		for(int i = 0; i < first.length; i++){
			System.out.print("arr[" + i + "] = ");
			first[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Fill in the second array:");
		for(int i = 0; i < second.length; i++){
			System.out.print("arr[" + i + "] = ");
			second[i] = sc.nextInt();
		}
		
		for(int i = 0; i < first.length; i++){
			if(first[i] > second[i]){
				maxValues[i] = first[i];
			}
			else{
				maxValues[i] = second[i];
			}
		}
		
		System.out.println();
		System.out.println("The third array is:");
		for(int i = 0; i < second.length; i++){
			System.out.print(maxValues[i]+ " ");
		}
		
		sc.close();
	}
}
