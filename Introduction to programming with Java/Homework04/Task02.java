import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size;
		
		do{
			System.out.print("Enter the size of the matrix: ");
			size = sc.nextInt();
		}
		while(size <= 0);
		
		int matrix[][] = new int[size][size];
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print("matrix[" + i + "][" + j + "] = ");
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Main diagonal:");
		for(int i = 0; i < matrix.length; i++){
			System.out.print(matrix[i][i] + " ");
		}
		
		System.out.println();
		System.out.println("Antidiagonal 2:");
		
		for(int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--){
			System.out.print(matrix[i][j] + " ");
		}
		
		sc.close();
	}
}
