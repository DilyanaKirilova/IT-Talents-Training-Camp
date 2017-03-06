import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number between 1 and 31: ");
		short day = sc.nextShort();
		System.out.print("Enter a number between 1 and 12: ");
		short month = sc.nextShort();
		System.out.print("Enter a positive number : ");
		short year = sc.nextShort();
		
		sc.close();
		
		System.out.println("Date:      " + day + " " + month + " " + year);
		
		short maxDays = 0;
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			maxDays = 31;
			printNextDate(day, month, year, maxDays);
			break;
		case 2:
			if(isLeap(year)){
				maxDays = 29;
				printNextDate(day, month, year, maxDays);
			}
			else{
				maxDays = 28;
				printNextDate(day, month, year, maxDays);
			}
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			maxDays = 30;
			printNextDate(day, month, year, maxDays);
			break;
		default:
			System.out.println("Invalid date.");
		}
	}
	
	static boolean isLeap(short year){
		return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
	}
	
	static void validDate(short day, short month, short year, int maxDays){
		if(day > maxDays || day <= 0 || year <= 0){
			System.out.println("Error: Invalid date.");
			System.exit(1);
		}
	}
	
	static void printNextDate(short day, short month, short year, short maxDays){
		validDate(day, month, year, maxDays);
	    day++;
		if(day > 30){
			day = 1;
			month++;
		}
		if(month > 12){
			month = 1;
			year++;
		}
		System.out.println("Next date: " + day + " " + month + " " + year);
	}	
}
