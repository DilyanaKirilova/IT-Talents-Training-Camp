import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How much money do you have? ");
		double money = sc.nextDouble();
		System.out.println("Are you healthy? (true/false) ");
		boolean health = sc.nextBoolean();
		 
		if(!health){
			 System.out.println("I won't go out.");
			 if(money > 0){
				System.out.println("I will buy pills.");
			 }
			 else{
				 System.out.println("I will stay at home and drink some tea.");
			 }
		}
		else{
			 if(money > 0 && money < 10){
				 System.out.println("I will go to the cafe.");
			 }
			 if(money > 0){
				 System.out.println("I will go to the cinema with friends.");
			 }
		}
		sc.close();
	}
}
