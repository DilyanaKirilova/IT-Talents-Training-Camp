import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		do{
			System.out.println("Enter a string only from alphabetic characters.");
			str = sc.nextLine();
		}
		while(!isValidString(str));
		
		countWords(str);

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
	
	static void countWords(String str){
		
		boolean firstMet = true;
		int countWords = 0;
		int maxWordLen = 0;
		int tempWordLen = 0;
		
		for(int i = 0; i < str.length(); i++){
			
			if(!Character.isAlphabetic(str.charAt(i))){
				firstMet = true;
			}
			else if(Character.isAlphabetic(str.charAt(i)) && firstMet){
				
				countWords++;
				firstMet = false;
				
				if(tempWordLen > maxWordLen){
					maxWordLen = tempWordLen;
				}
				tempWordLen = 1;
			}
			else{
				tempWordLen++;
			}
			if(tempWordLen > maxWordLen){
				maxWordLen = tempWordLen;
			}
		}
		
		System.out.println("Number of words: " + countWords);
		System.out.println("Max word length: " + maxWordLen);
	}
}