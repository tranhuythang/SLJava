package lesson5;

public class L5P3APSearch {
	public static void main(String[] args) {
		int[] numbers1 = new int[]{1, 2, 3, 4, 5, 6};
		int[] numbers2 = new int[]{1, 2, 3, 4, 5, 6};
		System.out.println("found at: " + recursiveBinarySearch(numbers1, 0, numbers1.length, 4));
		
//		System.out.println("found at: " + recursiveBinarySearch(numbers2, 0, numbers2.length, 4));		
	}
	
	public static int iterativeBinarySearch(int[] seq, int target) {
		int left = 0;
		int right = seq.length - 1;
		while(left <= right) {
			int mid = (left + right)/2;
			if(seq[mid] == target)
				return mid;
			if(seq[mid] >= target)
				right = 
				
		}
	}
	
	public static int recursiveBinarySearch(int[] seq, int left, int right, int target) {
		if(left > right)
			return -1;
		int mid = (left + right)/2;
		if(seq[mid] == target)
			return mid;
		if(seq[mid] > target)
			return recursiveBinarySearch(seq, left, mid, target);
		else
			return recursiveBinarySearch(seq, mid, right, target);		
	}
}
