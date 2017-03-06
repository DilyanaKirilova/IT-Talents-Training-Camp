
public class Homework {

	public static void main(String[] args) {
		

		int[] arr = {5,10,6,9,3,6,2,4,1,3};
		System.out.println("Broi elementi = " + arr.length);
		selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	static void selectionSort(int[] array){

		for (int k = 0; k < array.length/2; k++) {
			int min = array[k];
			int minIndex = k;
			int max = array[k];
			int maxIndex = k;
			for (int i = k+1; i < array.length - k; i++) {
				if(array[i] < min){
					min = array[i];
					minIndex = i;
				}
				if(array[i] > max){
					max = array[i];
					maxIndex = i;
				}
			}
			
			//swap max with last
			if(minIndex != k){
				//swap min with first
				int temp = array[minIndex];
				array[minIndex] = array[k];
				array[k] = temp;
				
				maxIndex = minIndex;
			}
			
			
			int temp2 = array[maxIndex];
			array[maxIndex] = array[array.length-1-k];
			array[array.length-1-k] = temp2;
			
			
		}
		
	}
}
