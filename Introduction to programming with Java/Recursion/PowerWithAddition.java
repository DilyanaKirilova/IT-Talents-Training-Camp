
public class PowerWithAddition {
	public static void main(String[] args) {
		
		System.out.println(powWithAdd(2,3));
		
	}
	
	static long powWithAdd(int x, int y){
		
		if(x == 1 || y == 0){
			return 1;
		}
		
		if(y == 1){
			return (long)x;
		}
		
		if(x == 0){
			return 0;
		}
		
		long sum = 0L;
		
		long prevPower = powWithAdd(x, y - 1);
		for(int i = 0 ; i < Math.abs(x); i++){
			sum += prevPower;
		}
		
		return sum;
	}
}
