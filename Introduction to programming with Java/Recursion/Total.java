
public class Total {
	public static void main(String[] args) {
		
		System.out.println(total(5));
		
		System.out.println(getTotal(5, 4));
		
	}
	
	// calculates numbers from 0 to n.
	static int total(int n){
		
		if (n == 0){
			return 0;
		}

		return n + total(n - 1);
	}
	
	// calculates numbers from number to n.
	static int getTotal (int n, int number)
	{
		if(n < number){
			System.out.println("Invalid interval.");
			return 0;
		}
		
	    if(n == number){
	    	return n;
	    }
	    return n + getTotal(n - 1, number);
	}
}
