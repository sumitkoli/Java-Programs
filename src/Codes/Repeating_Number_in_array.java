package Codes;

import java.util.Arrays;

public class Repeating_Number_in_array {

	public void repeating_number() {
		int i, j, k;

		int a[] = new int[] { 1, 2, 3, 4, 2, 1, 3, 5, 6, 5, 2, 1, 7, 8, 7, 9 };

		Arrays.sort(a);
		System.out.println("Duplicate number are : ");

		for (i = 0; i < a.length; i++) {
			j = 1;
			for (k = i + 1; k < a.length; k++) {

				if (a[i] == a[k]) {
					j++;
				} else {
					break;
				}
			}
			i = k - 1;
			//System.out.println("h"+i);
			if (j > 1) {
				System.out.println(a[i]+" "+j);
			}
		}

	}

	public static void main(String[] args) {

		Repeating_Number_in_array repeat = new Repeating_Number_in_array();
		repeat.repeating_number();

	}

}
