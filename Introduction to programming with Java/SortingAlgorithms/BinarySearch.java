
public class BinarySearch {
	public static void main(String[] args) {
		
		int[] arr = {1, 4, 7, 13, 17, 25, 26, 35, 41};
		
		
		System.out.println(binarySearch(arr, 7, 0, arr.length -1));
	}
	
	static int binarySearch(int[] arr, int num, int start, int end){
		
		int mid = (start + end) / 2;
		
		if(start == end){
			return -1;
		}
		
		if(arr[mid] == num){
			return mid;
		}
		
		if(arr[mid] > num){
			return binarySearch(arr, num, start, mid - 1);
		}
		
		return binarySearch(arr, num, mid + 1, end);
	}
}
