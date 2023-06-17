package Codes;

import java.util.Scanner;

public class Fibonaaci_Series {

	
	public void fibonaaci_series() {
		
		int count;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value till fibonacci Series to be Printed : ");
		
		count=sc.nextInt();
		
		int n1=0,n2=1,n3;
		
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<=count;i++) {
			
			n3=n2+n1;
			System.out.print(" "+n3);
			
			n1=n2;
			n2=n3;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fibonaaci_Series fib=new Fibonaaci_Series();
		fib.fibonaaci_series();
	}

}
