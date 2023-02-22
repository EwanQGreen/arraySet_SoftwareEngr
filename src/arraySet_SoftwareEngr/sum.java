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
}

