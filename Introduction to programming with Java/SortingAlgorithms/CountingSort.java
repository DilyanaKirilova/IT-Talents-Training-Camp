
public class CountingSort {
	public static void main(String[] args) {
		
		int[] arr = {1, 5, 6, 3, 9, 5, 4, 3, 1};
		countingSort(arr);
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	
	}
	static void countingSort(int[] arr){
		
		// find the maximum elem
	
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		//create helper arrays with maxelem + 1 length
		
		int[] helper= new int[max + 1];
		
		for(int i = 0; i < arr.length; i++){
			helper[arr[i]]++;
		}
		
		int ind = 0;
		for(int value = 0; value < helper.length; value++){
			for(int times = 0; times < helper[value]; times++){
				arr[ind] = value;
				ind++;
			}
		}
	}
}
