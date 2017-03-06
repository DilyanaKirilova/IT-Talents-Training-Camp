import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first word: ");
		String str1 = sc.next();
		System.out.print("Enter the second word: ");
		String str2 = sc.next();
		
		printCrossing(str1, str2);
		
		sc.close();
	}
	
	static void printCrossing(String str1, String str2){
		
		boolean isPrinted = false;
		
		for(int i = 0; i < str2.length(); i++){
			
			if(str2.charAt(i) == str1.charAt(0) && !isPrinted){
				System.out.println(str1);
				isPrinted = true;
			}
			else{
				System.out.println(str2.charAt(i));
			}
		}
		
		if(!isPrinted){
			System.out.println("The words are not crossing.");
		}
	}
}
