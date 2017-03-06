import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int len;
		
		do{
			System.out.print("Enter the length of the array: ");
			len = sc.nextInt();
		}
		while(len <= 0 );
		
		double[] arr = new double[len];
		
		for(int i = 0; i < arr.length; i++){
			System.out.print("arr[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		
		if(len < 3){
			System.out.println("There is no three different numbers in the array.");
			sc.close();
			return;
		}
		
		double[] maxValues = new double[3];
		maxValues[0] = arr[0];
		maxValues[1] = arr[1];
		maxValues[2] = arr[2];
		
		if(maxValues[0] == maxValues[1] || maxValues[0] == maxValues[2] || maxValues[1] == maxValues[2]){
			System.out.println("There is no three different numbers in the array.");
			sc.close();
			return;
		}
		
		if(len == 3){
			System.out.println(maxValues[0] + ", " + maxValues[1] + ", " + maxValues[2]);
			sc.close();
			return;
		}
		
		maxValues[0] = 0;
		maxValues[1] = 0;
		maxValues[2] = 0;
		
		double temp = 0;
		int j = 0;
		for(int i = 0; i < arr.length; i++){
			temp = Math.abs(arr[i]);
			if(temp >Math.abs(maxValues[j])){
				maxValues[j] = arr[i];
			}
		}
		
		j++;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == maxValues[j-1]){
				continue;
			}
			temp = Math.abs(arr[i]);
			if(temp > Math.abs(maxValues[j])){
				maxValues[j] = arr[i];
			}
		}
		
		j++;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == maxValues[j-1] || arr[i] == maxValues[j-2]){
				continue;
			}
			temp = Math.abs(arr[i]);
			if(temp > Math.abs(maxValues[j])){
				maxValues[j] = arr[i];
			}
		}
		
		for(int i = 0; i < maxValues.length; i++){
			System.out.print(maxValues[i] + " ");
		}
		
		sc.close();
	}
}
