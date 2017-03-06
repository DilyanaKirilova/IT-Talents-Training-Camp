
public class QuickSort {
	 public static void main(String[] args) {
		
		 int[] arr = {2,4,4,5,30,7,80,67,22,53,3,5,6,7, 4};
		 
		 quickSort(arr, 0, arr.length -1);
		 
		 for(int i = 0; i < arr.length; i++){
			 System.out.print(arr[i] + " ");
		 }
		 
	}
	 
	 static int partition(int[] arr, int start, int end){
		 int pivot = arr[end];
		 int ind = start;
		 
		for(int i = start; i < end; i++){
			 if(arr[i] <= pivot){
				 
				 int temp = arr[i];
				 arr[i] = arr[ind];
				 arr[ind] = temp;
				 ind++;
			 }
		 }
		 
		int temp = arr[ind];
		arr[ind] = pivot;
		arr[end] = temp;
		
		return ind;
	 }
	 
	 static void quickSort(int[] arr, int start, int end){
		 
		 if(start >= end){
			 return;
		 }
		 int pivotIndex = partition(arr, start, end);
		 
		 quickSort(arr, start, pivotIndex - 1);
		 quickSort(arr, pivotIndex + 1, end);
	 }
}
