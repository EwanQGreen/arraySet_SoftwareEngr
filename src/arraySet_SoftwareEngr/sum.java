package arraySet_SoftwareEngr;

import java.util.Scanner;

public class sum {
	public static int array_sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; ++i) {
			sum += array[i];
		}
		return sum;
	}
	public static int array_product(int[] array) {
		int sum = 1;
		for (int i = 0; i < array.length; ++i) {
			sum *= array[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Input Array Size:");
		Scanner scnr = new Scanner(System.in);
		int arrLength = scnr.nextInt();
		int[] arr = new int[arrLength];
		int i = 0;
		while (i < arrLength) {
			arr[i] = scnr.nextInt();
			++i;
		}
		System.out.println("Sum: " + array_sum(arr));
		System.out.println("Product: " + array_product(arr));
		
		scnr.close();
	}
}

