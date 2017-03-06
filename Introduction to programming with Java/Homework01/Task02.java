import java.util.Scanner;
public class Task02 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first operand: ");
		int operand1 = sc.nextInt();
		System.out.print("Enter the second operand: ");
		int operand2 = sc.nextInt();
		
		sc.close();
		
		System.out.println(operand1 + " + " + operand2 + " = " + addition(operand1, operand2));
		System.out.println(operand1 + " - " + operand2 + " = " + subtraction(operand1, operand2));
		System.out.println(operand1 + " * " + operand2 + " = " + multiplication(operand1, operand2));
		System.out.println(operand1 + " / " + operand2 + " = " + division(operand1, operand2));
		System.out.println(operand1 + " % " + operand2 + " = " + modulus(operand1, operand2));
	}
	
	static int addition(int operand1, int operand2){
		
		return operand1 + operand2;
	}
	
	static int subtraction(int operand1, int operand2){
		
		return operand1 - operand2;
	}
	
	static int multiplication(int operand1, int operand2){
		
		return operand1 * operand2;
	}
	
	static int division(int operand1, int operand2){
		
	if(operand2 == 0){
		System.out.println("Error: zero division.");
	    System.exit(1);
	}
		return operand1 / operand2;
	}

	static int modulus(int operand1, int operand2){
		
	if(operand2 == 0){
		System.out.println("Error: zero division.");
        System.exit(1);
	}
		return operand1 % operand2;
	}
}
