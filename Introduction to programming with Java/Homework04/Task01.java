import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] matrix = new int[6][5];
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print("matrix[" + i + "][" + j + "] = ");
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int min = matrix[0][0];
		int max = matrix[0][0];
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				if(matrix[i][j] < min){
					min = matrix[i][j];
				}
				if(matrix[i][j] > max){
					max = matrix[i][j];
				}
			}
		}
		
		System.out.println("Min element in matrix: " + min);
		System.out.println("Max element in matrix: " + max);
		
		sc.close();
	}
}
