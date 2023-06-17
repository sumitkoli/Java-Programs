package Codes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Even_Number_Counts {

	
	public void even_number_counts() {
		
		System.out.println("Enter the number to which even number is calculated: ");
		int n,i;
		int j = 0,k=0;
		int p = 0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		int a[] = new int[n];
		int b[] =new int[n];
		
		for(i=0;i<n;i++) {
			if(i%2==0) {
			 a[i]=i;
			 j++;
			}
			else {
				b[i]=i;
				k++;
			}
		}
		
		System.out.println(+j);
		System.out.println(+k);
		
		System.out.println(a.length);
		
		for (a[p] = 1; a[p] <= j; a[p]++) {
			System.out.println(Arrays.toString(a));
		} /*
			 * for(i=1;i<=k;i++) { System.out.println(+b[i]); }
			 */
		 
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Even_Number_Counts ecount=new Even_Number_Counts();
		ecount.even_number_counts();
	}

}
