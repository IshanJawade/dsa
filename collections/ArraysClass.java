package collections;

import java.util.Arrays; // <- this one

public class ArraysClass {
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 4, 5, 6, 8, 9, 3, 10, 7};

		int index = Arrays.binarySearch(arr, 4);

		System.out.println("The index of 4 in the array is " + index);

		Arrays.sort(arr);

		for (int i: arr)
			System.out.print(i + " ");

		Arrays.fill(arr, 25);

		for (int i: arr)
			System.out.print(i + " ");
 	}
}
