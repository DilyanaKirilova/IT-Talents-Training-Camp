import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] matrix = new int[4][4];
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print("matrix[" + i + "][" + j + "] = ");
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int maxRowSum = matrix[0][0];
		int maxColSum =  matrix[0][0];
		
		for(int i = 0; i < matrix.length; i++){
			int tempRowSum = 0;
			for(int j = 0; j < matrix[i].length; j++){
				tempRowSum += matrix[i][j];
			}
			if(tempRowSum > maxRowSum){
				maxRowSum = tempRowSum;
			}
		}
		System.out.println("Max row sum: " + maxRowSum);
		
		
		for(int i = 0; i < matrix[0].length; i++){
			int tempColSum = 0;
			for(int j = 0; j < matrix.length; j++){
				tempColSum += matrix[j][i];
			}
			if(tempColSum > maxColSum){
				maxColSum = tempColSum;
			}
		}
		
		System.out.println("Max col sum: " + maxColSum);
		
		if(maxRowSum > maxColSum){
			System.out.println("Max row sum > max col sum.");
		}
		else if(maxRowSum < maxColSum){
			System.out.println("Max row sum < max col sum.");
		}
		else{
			System.out.println("Max row sum = max col sum.");
		}
		
		sc.close();
	}
}
