
public class Task21{
	public static void main(String[] args) {
		
		print(9);
		print(15);
		print(18);
		print(24);
	}
	
	static void print(int n){
		
		printCard(n);
		if(n % 4 == 1)
			System.out.print("Spades");
		else if(n % 4 == 2)
			System.out.print("Diamond");
		else if(n % 4 == 1)
			System.out.print("Heart");
		else if(n % 4 == 0)
			System.out.print("Club");
		else
			System.out.println("No such a card.1");
	}
	static void printCard(int n){
		
		int value = 0;
		if(n >= 1 && n < 10){
			value =  n / 2 + 1;
			System.out.println(value + " ");
		}
		else
		{
			switch(n){
			case 10: System.out.print("Jack ");
			break;
			case 11: System.out.print("Queen ");
			break;
			case 12: System.out.print("King ");
			break;
			case 13: System.out.print("Ace ");
			break;
			default:
				System.out.println("No such a card.");
			}
		}
	}
}