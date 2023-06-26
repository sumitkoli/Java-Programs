package Codes;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Function3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]= {"Dog","Cat","Cow"};
		
		for(String value:arr) {
			System.out.println(value);
		}
		
		//Converting Array to an ArrayList
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println("After converting Array to ArrayList :");
		System.out.println(al);
	}

}
