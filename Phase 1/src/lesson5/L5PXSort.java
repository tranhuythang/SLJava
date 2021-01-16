package lesson5;

import java.util.Arrays;

public class L5PXSort {
	public static void main(String[] args) {
		int[] numbers = new int[] {6, 5, 1, 3, 3, 9, 4, 2, 1};
		System.out.println(Arrays.toString(numbers));
		System.out.println("buble: " + Arrays.toString(bubleSort(numbers)));		
		System.out.println("selection: " + Arrays.toString(selectionSort(numbers)));
	}
	
	public static int[] selectionSort(int[] numbers) {
		int size = numbers.length;
		for(int i = 0; i < size; i++) {
			int minIndex = i;
			for(int j = i; j < size; j++)
				if(numbers[j] < numbers[minIndex])
					minIndex = j; 
			swap(numbers, i, minIndex);		
		}
		return numbers;
			
	}
	
	public static int[] bubleSort(int[] numbers) {
		int size = numbers.length;
		for(int i = 0; i < size; i++)
			for(int j = 1; j < size - i; j++) {				
				if(numbers[j] < numbers[j-1])
					swap(numbers, j, j-1);
			}
		return numbers;
	}
	
	public static void swap(int[] numbers, int i1, int i2) {
		int temp = numbers[i1];
		numbers[i1] = numbers[i2];
		numbers[i2] = temp;
	}	
}
