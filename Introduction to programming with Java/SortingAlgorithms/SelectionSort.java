
public class SelectionSort {
	public static void main(String[] args) {
		
		int[] arr = {1, 5, 6, 3, 9, 5, 4, 3, 1};
		selectionSort(arr);
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	static void selectionSort(int[] arr){
		
		// set the first element as minimum 
		// if there is smaller number in the array set it to minimum
		// minimum to first unsorted array index
		// while !sorted
		
		boolean isSorted = false;
		
		while(!isSorted){
			
			isSorted = true;
			for(int i = 0; i < arr.length; i++){
				
				int iMin = i;
			
				for(int j = i + 1; j < arr.length; j++){
					
					if(arr[i] > arr[j]){
						iMin = j;
						isSorted = false;
					}
					
				}
				if(iMin != i){
					int temp = arr[iMin];
				    arr[iMin] = arr[i];
				    arr[i] = temp;
				}
			}
		}
	}
}

