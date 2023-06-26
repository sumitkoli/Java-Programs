package Codes;

import java.util.Scanner;

public class Star_Pattern {
   
	public void reverse() {
		int i,j,n=6;
		 for( i=0;i<n;i++) {
			  
			  for( j=n-i;j>0;j--) { 
				  
				  System.out.print(" ");
			  } 
			  for(j=0;j<=i;j++) 
			  {
			  
			  System.out.print("* ");
			  
			  } 
			  
			  System.out.println(); 
			  }
	}
	
	public void inverse() {
		int i,j,n=6;



		for(i=0;i<=n;i++) {

			for(int k=0;k<i;k++) {

				System.out.print(" ");
			}
			for(j=n;j>i;j--) {

				System.out.print(" *");
			}



			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Star_Pattern rev=new Star_Pattern();
		
		rev.reverse();
		rev.inverse();
		 
	
	}

}




