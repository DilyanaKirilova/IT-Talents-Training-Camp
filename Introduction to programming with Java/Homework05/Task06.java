import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		do{
			System.out.println("Enter a string only from alphabetic characters.");
			str = sc.nextLine();
		}
		while(!isValidString(str));
		
		printCorrectedString(str);

	
		sc.close();
	}
	
	static boolean isValidString(String str){
		
		if(str == null || str != ""){
			return false;
		}
		
		for(int i = 0; i < str.length(); i++){
			if(!(Character.isAlphabetic(str.charAt(i)) || str.charAt(i) == ' ')){
				return false;
			}
		}
		
		return true;
	}
	
	static void printCorrectedString(String str){
		
		str = str.toLowerCase();
		
		boolean firstMet = true;
		
		for(int i = 0; i < str.length(); i++){
			
			if(!Character.isAlphabetic(str.charAt(i))){
				System.out.print(str.charAt(i));
				firstMet = true;
			}
			else if(Character.isAlphabetic(str.charAt(i)) && firstMet){
				
				System.out.print((char)(str.charAt(i) - ('a' - 'A')));
				firstMet = false;
			}
			else{
				System.out.print(str.charAt(i));
			}
		}
	}
}
