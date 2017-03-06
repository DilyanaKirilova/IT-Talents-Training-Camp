import java.util.Scanner;

public class Task09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		String str = "";
		do{
			System.out.println("Enter a string.");
			str = sc.nextLine();
		}
		while(!isValidString(str));
			
		System.out.println("Sum: " + sumNumbers(str));
		
		sc.close();
	}
	static boolean isValidString(String str){
		
		if(str == null || str != ""){
			return false;
		}
		
		for(int i = 0; i < str.length(); i++){
			
			if(!(Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i)) || str.charAt(i) == '-')){
				return false;
			}
		}
		return true;
	}
	
	static int sumNumbers(String str){
		
		int sum = 0;
		int tempNum = 0;
		boolean isNegative = false;
		boolean isFirstDig = true;
		
		for(int i = 0; i < str.length(); i++){
			
			if(!Character.isDigit(str.charAt(i))){
				
				sum = addToSum(sum, isNegative, tempNum);
				
				isNegative = false;
				isFirstDig = true;
				
				while(!Character.isDigit(str.charAt(i)) && i < str.length()){
					i++;
				}
				i--;
			}
			else{
				if(isFirstDig){
					isFirstDig = false;
					tempNum = 0;
					if(i > 0 && str.charAt(i - 1) == '-'){
						isNegative = true;
					}
				}
				else{
					tempNum *= 10;
				}
				tempNum += Character.getNumericValue(str.charAt(i));
			}
		}
		if(Character.isDigit(str.charAt(str.length() - 1))){
			sum = addToSum(sum, isNegative, tempNum);
		}
		return sum;
	}
	
	static int addToSum(int sum, boolean isNegative, int num){
		if(num != 0){
			if(isNegative){
				System.out.print('-');
				sum -= num;
			}
			else{
				sum += num;
			}
			System.out.println(num);
		}
		return sum;
	}
}
