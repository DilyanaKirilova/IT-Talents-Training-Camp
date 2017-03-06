import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = "";
		String str2 = "";
		
		do{
			System.out.println("Enter the first string.");
			System.out.println("The length must be in range [10; 20]: ");
			str1 = sc.next();
		}
		while(!isValidString(str1));
		
		do{
			System.out.println("Enter the second string.");
			System.out.println("The length must be in range [10; 20]: ");
			str2 = sc.next();
		}
		while(!isValidString(str2));
		
		int maxLength = str1.length() > str2.length()? str1.length() : str2.length();
		
		System.out.println(maxLength);
		
		System.out.println(str1 + " " + str2);
		
		String temp = str2.substring(0, 5) + str1.substring(5, str1.length());
		str2 = str1.substring(0, 5) + str2.substring(5, str2.length());
		str1 = temp;
		
		System.out.println(str1 + " " + str2);
		
		sc.close();
	}
	
	static boolean isValidString(String str){
		return str.length() >= 10 && str.length() <= 20;
	}
}
