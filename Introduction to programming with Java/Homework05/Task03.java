import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = "";
		String str2 = "";
		
		System.out.println("Enter the first string.");
		str1 = sc.next();
		
		System.out.println("Enter the second string.");
		str2 = sc.next();
		
		if(!equalLengths(str1, str2)){
			System.out.println("The strings are with differrent lengths.");
			sc.close();
			return;
		}
		
		System.out.println("The strings are with same lengths.");
		printDiffereces(str1, str2);
	
		sc.close();
	}
	
	static boolean equalLengths(String str1, String str2){
		
		return str1.length() == str2.length();
	}
	
	static void printDiffereces(String str1, String str2){
		
		for(int i = 0; i < str1.length(); i++){
			if(str1.charAt(i) != str2.charAt(i)){
				System.out.println(i + 1 + " " + str1.charAt(i) + "-" + str2.charAt(i) + " ");
			}
		}
	}
}
