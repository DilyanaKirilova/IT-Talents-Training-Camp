import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
		
		String str = "";
		do{
			System.out.println("Please, enter two full names, separated by comma.");
			str = sc.nextLine();
		}
		while(!isValidString(str));
		
		printBiggerSumName(str);
	
		sc.close();
	}
	
	static boolean isValidString(String str){
		
		if(str == null || str == ""){
			return false;
		}
		
		int mid = 0;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == ','){
				mid = i;
			}
			else if(!(Character.isAlphabetic(str.charAt(i)) || str.charAt(i) == ' ')){
				return false;
			}
		}
		if(mid == 0 || mid == str.length() - 1){
			return false;
		}
		return true;
	}
	
	static int sumChars(String str){
		int sum = 0;
		for(int i = 0; i < str.length(); i++){
			if(Character.isAlphabetic(str.charAt(i))){
				sum += (int)str.charAt(i);
			}
		}
		return sum;
	}
	
	static void printBiggerSumName(String str){
		
		int mid = 0;
		
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == ','){
				mid = i;
			}
		}
		String first = str.substring(0, mid);
		String second = str.substring(mid + 1, str.length());
		
		int len1 = sumChars(first);
		int len2 = sumChars(second);
		
		if(len1 > len2){
			System.out.println(first);
		}
		else if(len1 < len2){
			System.out.println(second);
		}
		else{
			System.out.println(first);
			System.out.println(second);
		}	
	}
}
