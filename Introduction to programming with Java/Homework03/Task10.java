import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[7];
		
		int sum = 0;
		double average = 0;
		
		for(int i = 0; i < arr.length; i++){
			System.out.print("arr[" + i + "] = ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		average = (double)sum / (double)arr.length;
		
		double minDistance = Double.MAX_VALUE;
		int res = 0;
		
		for(int i = 0; i < arr.length; i++){
			double tempDistance = Math.abs(arr[i] - average);
			if(tempDistance < minDistance){
				minDistance = tempDistance;
				res = i;
			}
		}

		System.out.println("The closest value in the array to average(" + average + ") is: " + arr[res]);
		sc.close();
	}
}
