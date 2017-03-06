import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int len;
		
		do{
			System.out.print("Enter the length of the array: ");
			len = sc.nextInt();
		}
		while(len <= 0);
		
		double[] first = new double[len];
		
		int sum = 0;
		for(int i = 0; i < first.length; i++){
			System.out.print("arr[" + i + "] = ");
			first[i] = sc.nextInt();
			if(first[i] >= -2.99 && first[i] <= 2.99){
				sum++;
			}
		}
		
		if(sum <= 0){
			System.out.println("No numbers between -2.99 and 2.99");
			sc.close();
			return;
		}
		
		double[] second = new double[sum];
		
		int j = 0;
		
		for(int i = 0; i < first.length; i++){
			if(first[i] >= -2.99 && first[i] <= 2.99){
				second[j] = first[i];
				j++;
			}
		}
		
		for(int i = 0; i < second.length; i++){
			System.out.print(second[i] + " ");
		}
		
		sc.close();
	}
}
