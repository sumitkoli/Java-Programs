package Codes;

import java.util.*;

public class test1 {

	public void reverse() {

		int n1=0,n2=1;
		int n3,i;
		int n=10;
		System.out.print(+n1+" "+n2);
		for(i=1;i<n;i++) {
			n3=n2+n1;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
		
		
	}

	public static void main(String[] args) {

		test1 rev = new test1();
		rev.reverse();

	}
}
