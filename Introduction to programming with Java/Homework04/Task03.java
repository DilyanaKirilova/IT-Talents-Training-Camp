import java.util.Scanner;

public class Task03 {
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
		
		int sum = 0;
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				sum += matrix[i][j];
			}
		}
		
		double average = (double)sum / (matrix.length * matrix[0].length);
		
		System.out.println("The sum of elements is: " + sum);
		System.out.println("The average of elements is: " + average);
		
		sc.close();
	}
}
