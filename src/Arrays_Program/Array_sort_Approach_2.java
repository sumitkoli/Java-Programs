package Arrays_Program;

import java.util.Arrays;

public class Array_sort_Approach_2 {

	public void sort() {
	int arr[]=new int[] {4,5,7,8,9,6,2,4};
	
	System.out.println("Elements of original array: ");
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i] + " ");
    }
	
	Arrays.sort(arr);
	
	System.out.println(
            "Elements of array sorted in ascending order : "
            + Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_sort_Approach_2 sr=new Array_sort_Approach_2();
		sr.sort();
	}

}
