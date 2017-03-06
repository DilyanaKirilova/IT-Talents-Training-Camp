import java.util.Scanner;
import java.lang.Math;

public class AreaCalculator {
	
	static double PI = 3.14;
	
	public static void main(String[] args)
	{
		printMenu();
		
		Scanner input = new Scanner(System.in);
		String choice = input.nextLine();

		commandExecution(choice);
		
		input.close();
		
	}
	
	
	static void printMenu(){
		
		System.out.println("Calculate area for:");
		System.out.println();
		System.out.println("square");
		System.out.println("rectangle");
		System.out.println("circle");
		System.out.println("circumference");
		System.out.println("parallelogram");
		System.out.println("triangle");
	}
	
	
	static void commandExecution(String choice){
		
		double param1 = 0;
		double param2 = 0;
		double param3 = 0;
		Scanner input = new Scanner(System.in);
	
		switch(choice) {
		
		case "square":
			
			System.out.print("Type in side length of the square: ");
			param1 = input.nextDouble();
	
			System.out.println(squareArea(param1));
			break;
			
			
		case "rectangle":
			
			System.out.print("Type in width of the rectangle: ");
			param1 = input.nextDouble();
			
			System.out.print("Type in height of the rectangle: ");
			param2 = input.nextDouble();
			
			System.out.println(rectangleArea(param1, param2));
			break;
			
			
		case "circle":
			
			System.out.print("Type in radius of the circle: ");
			param1 = input.nextDouble();
			
			System.out.println(circleArea(param1));
			break;
			
			
		case "circumference":
			
			System.out.print("Type in radius of the circumference: ");
			param1 = input.nextDouble();
			
			System.out.println(circumferenceArea(param1));
			break;
			
			
		case "parallelogram":
			
			System.out.print("Type in base of the parallelogram: ");
			param1 = input.nextDouble();
			
			System.out.print("Type in height of the parallelogram: ");
			param2 = input.nextDouble();
			
			System.out.println(parallelogramArea(param1, param2));
			break;
			
			
		case "triangle":
			
			System.out.print("Type in first side of the triangle: ");
			param1 = input.nextDouble();
			
			System.out.print("Type in second side of the triangle: ");
			param2 = input.nextDouble();
			
			System.out.print("Type in third side of the triangle: ");
			param3 = input.nextDouble();
			
			System.out.println(arbitraryTriangleArea(param1, param2, param3));
			break;
			
			
			default:
				
				System.out.println("Invalid input for shape.");
		}
		input.close();
	}
	
	
	static double squareArea(double side){
		
		if(!isPositiveNum(side)){
			System.out.println("The side can NOT be negative number.");
			System.exit(1);
		}
		
		return Math.pow(side, 2);
	}
	
	static double rectangleArea(double width, double height){
		
		if(!isPositiveNum(width) || !isPositiveNum(height)){
			System.out.println("The parameters can NOT be negative numbers.");
			System.exit(1);
		}
		
		return width * height;
	}
	
	static  double circleArea(double radius){
		if(!isPositiveNum(radius)){
			System.out.println("The radius can NOT be negative number.");
			System.exit(1);
		}
		
		return PI * Math.pow(radius, 2); 
	}
	
	static double circumferenceArea(double radius){
		
		if(!isPositiveNum(radius)){
			System.out.println("The radius can NOT be negative number.");
			System.exit(1);
		}
		
		return 2 * PI * radius;
	}
	
	static double parallelogramArea(double base, double height){
		
		if(!isPositiveNum(base) || !isPositiveNum(height)){
			System.out.println("The parameters can NOT be negative numbers.");
			System.exit(1);
		}
		
		return base * height;
	}
	

	static double arbitraryTriangleArea(double sideA, double sideB, double sideC){
		
		if(!isValidRectangle(sideA, sideB, sideC)){
			System.out.println("Invalid input for sides of the rectangle.");
			System.exit(1);
		}
			
		double semiperimeter = (sideA + sideB + sideC) / 2;
		
		double heronsFormula = Math.sqrt((semiperimeter * 
				                         (semiperimeter - sideA) *
				                         (semiperimeter - sideB) *
				                         (semiperimeter - sideC)));
		return heronsFormula;
	}
	
	
	static boolean isValidRectangle(double sideA, double sideB, double sideC){
		return ((sideA < (sideB + sideC)) && (sideB < (sideA + sideC)) && (sideC < (sideA + sideB)));
	}
	
	static boolean isPositiveNum(double num){
		return num > 0;
	}
}