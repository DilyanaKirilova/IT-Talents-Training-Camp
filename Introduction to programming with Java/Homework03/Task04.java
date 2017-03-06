import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int len;
		
		do{
			System.out.print("Enter the length of the array: ");
			len = sc.nextInt();
		}
		while(len <= 0);
		
		int[] arr = new int[len];
		
		for(int i = 0; i < arr.length; i++){
			System.out.print("arr[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		
		int beg = 0;
		int end = arr.length - 1;
		boolean mirrored = true;

        while(beg < end){
        	if(arr[beg] != arr[end]){
        		mirrored = false;
        		break;
        	}
        	beg++;
        	end--;
        }
		
        if(mirrored){
        	System.out.println("The array elements are mirrored.");
        }
        else{
        	System.out.println("The array elements are NOT mirrored.");
        }
        
		sc.close();
	}
}
