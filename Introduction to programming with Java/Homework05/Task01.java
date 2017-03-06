import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = "";
		String str2 = "";
		
		do{
			System.out.println("Enter the first string only from alphabetic characters.");
			System.out.println("The length must be in range (0; 40]: ");
			str1 = sc.next();
		}
		while(!isValidString(str1));
		
		do{
			System.out.println("Enter the second string only from alphabetic characters.");
			System.out.println("The length must be in range (0; 40]: ");
			str2 = sc.next();
		}
		while(!isValidString(str2));
		
		System.out.println(str1.toUpperCase() + " " + str1.toLowerCase() + " " + 
		                   str2.toUpperCase() + " " + str2.toLowerCase());
		
		sc.close();
	}
	
	static boolean isValidString(String str){
		return str != null && str != "" && str.length() < 40 && isAlphabeticString(str);
	}
	
	static boolean isAlphabeticString(String str){
		
		for(int i = 0; i < str.length(); i++){
			if(!Character.isAlphabetic(str.charAt(i))){
				return false;
			}
		}
		return true;
	}
}
