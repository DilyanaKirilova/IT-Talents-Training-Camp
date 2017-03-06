import java.util.Scanner;

public class Task01 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Define an interval: ");
		System.out.print("Enter the floor: ");
		double floor = sc.nextDouble();
		System.out.print("Enter the ceiling: ");
		double ceiling = sc.nextDouble();
		System.out.print("Enter a number (to check if it is within the interval): ");
		double num = sc.nextDouble();
		
		sc.close();
		
		isWithinInterval(floor, ceiling, num);
	}
	
	static boolean isWithinInterval(double floor, double ceiling, double num){
		
		if(!isInterval(floor, ceiling)){
			System.out.println("Invalid interval.");
			System.exit(1);
		}
		
		if(num >= floor && num <= ceiling){
			System.out.println(num + " is within the interval [" + floor + " ; " + ceiling + "].");
			return true;
		}
		
		System.out.println(num + " is NOT within the interval [" + floor + " ; " + ceiling + "].");
		return false;
	}
	
	static boolean isInterval(double floor, double ceiling){
		
		return floor < ceiling;
	}
}
