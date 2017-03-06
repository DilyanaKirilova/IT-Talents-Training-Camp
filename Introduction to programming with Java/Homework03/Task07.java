import java.util.Scanner;

public class Task07 {
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
		
		for(int i = 0; i < first.length; i++){
			System.out.print("arr[" + i + "] = ");
			first[i] = sc.nextInt();
		}
		
		for(int i = 0; i < second.length; i++){
			if(i == 0 || i == first.length - 1){
				second[i] = first[i];
			}
			else{
				second[i] = first[i - 1] + first[i + 1];
			}
		}
		
		for(int i = 0; i < second.length ; i++){
			System.out.print(second[i] + " ");
		}
		
		sc.close();
	}
}
