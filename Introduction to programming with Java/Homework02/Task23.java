
public class Task23 {
	public static void main(String[] args) {
		
		printTable();
	}
	
	static void printTable(){
		
		int i = 1;
		while (i < 10){
			for(int j = i; j < 10; j++){
	
				System.out.print(i + "*" + j + "; ");
			}
			i++;
			System.out.println();
		}
	}
}
