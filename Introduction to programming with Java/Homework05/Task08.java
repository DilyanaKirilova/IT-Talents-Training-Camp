import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
			
			String str = "";
			do{
				System.out.println("Enter a word.");
				str = sc.next();
			}
			while(!isValidString(str));
		
			System.out.println(isPalindrom(str));
			sc.close();
	}
	
	static boolean isValidString(String str){
		
		if(str == null || str != ""){
			return false;
		}
		
		for(int i = 0; i < str.length(); i++){
			
			if(!Character.isAlphabetic(str.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	static boolean isPalindrom(String str){
		
		int beg = 0;
		int end = str.length() - 1;
		
		while(beg < end){
			if(str.charAt(beg) != str.charAt(end)){
				return false;
			}
			beg++;
			end--;
		}
		return true;
	}
}
