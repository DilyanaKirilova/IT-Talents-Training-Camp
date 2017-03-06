import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] matrix = new int[6][6];
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print("matrix[" + i + "][" + j + "] = ");
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int sum = 0;
		for(int i = 0; i < matrix.length; i ++){
			int sumRow = 0;
			for(int j = 0; j < matrix[0].length; j ++){
				if((i + j)% 2 == 0){
					sumRow += matrix[i][j];
					System.out.print(matrix[i][j] + " ");
				}
			}
			sum += sumRow;
			System.out.println("sum: " + sumRow);
		}
		
		System.out.println();
		System.out.println("Sum of elements: " + sum);
		
		sc.close();
	}
}
