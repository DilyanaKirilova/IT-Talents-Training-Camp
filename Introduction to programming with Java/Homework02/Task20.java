
public class Task20 {
	public static void main(String[] args) {
		
		printMirr();
	}	
	static void printMirr(){
		int j = 1;
		for(int i = 1; i < 10; i++){
			for(j = i; j < 10; j++){
					System.out.print(j + " ");
			}
			for(int k = 0; k < i; k++){
				System.out.print(k + " ");
			}
			System.out.println();
		}	
		for(int l = 0; l < 10; l++){
			System.out.print(l + " ");
		}
	}
}
