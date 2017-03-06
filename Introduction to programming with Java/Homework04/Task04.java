import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rows;
		int cols;
		
		do{
			System.out.print("Enter the num of rows: ");
			rows = sc.nextInt();
			System.out.print("Enter the num of cols: ");
			cols = sc.nextInt();
		}
		while(rows <= 0 || cols <= 0);
		
		int matrix[][] = new int[rows][cols];
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print("matrix[" + i + "][" + j + "] = ");
				matrix[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < matrix[0].length; i++){
			for(int j = matrix.length -1; j >= 0; j--){
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
