public class BubbleSort {
	public static void main(String[] args) {
		
		int[] arr = {1, 5, 6, 3, 9, 5, 4, 3, 1};
		bubbleSort(arr);
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
	}
	
	static void bubbleSort(int[] arr){
		
		// take every two elements
		// if first is greatest than second
		// swap them
		// continue while there are no more swapping
		boolean isSorted = false;
		
		int len = arr.length;
		
		while(!isSorted){
			for(int i = 0; i < len; i++){
				for(int j = i + 1; j < len; j++){
					if(arr[i] < arr[j]){
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						isSorted = false;
					}
				}
				isSorted = true;
			}
			len--;
		}
	}
}
