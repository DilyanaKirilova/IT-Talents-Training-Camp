import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		do{
			System.out.println("Enter a string.");
			str = sc.nextLine();
		}
		while(!isValidString(str));
		
		String res = addFiveToString(str);
		System.out.println(res);
		
		sc.close();
	}
	static boolean isValidString(String str){
		
		return str != null && str != "";
	}
	
	static String addFiveToString(String str){
		
		StringBuilder result = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++){
			result.append((char)((int)str.charAt(i) + 5));
		}
		
		return result.toString();
	}
}
