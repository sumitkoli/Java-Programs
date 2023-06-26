package Codes;

import java.util.*;

public class test1 {

	public void reverse() {
		int i,j;

		int a[]=new int[] {1,2,3,4,2,1,3,5,6,5};

		System.out.println("Duplicate number are : ");

		for(i=0;i<a.length;i++) {

			for(int k=i+1;k<a.length;k++) {

				if(a[i]==a[k]) {
					System.out.println(+a[k]);
				}
			}
		}
	}

	public static void main(String[] args) {

		test1 rev=new test1();
		rev.reverse();

	}
}
