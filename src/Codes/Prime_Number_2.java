package Codes;

import java.util.Scanner;

public class Prime_Number_2 {
	 public void prime(int n) {
		 int i,j=2;
		 for(i=2;i<n;i++) {
			 if(n%i==0) {
				break;
			 }
			 else
				 j++;
		 }
		 if(j==n) {
			 System.out.println("Its an prime number : " +n);
		 }
		 else
		 {
		 System.out.println("Its not a prime number : "+n); 
		 }
	 }
	 
	 public void prime_numberrange(int n) {
		 
		 int i;
		
		 for(i=3;i<=n;i++) {
			 int k=2;
			 for(int j=2;j<i;j++) {
				 
			 if(i%j==0) {
				 System.out.println("Its not a prime Number : "+i);
				 break;
			 }
			 else {
				k++;
			 }
			 }
			 if(k==i) {
				 System.out.println("Its a prime Number : "+i);
			 }
			
		 }
	 }
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number to find factorial :");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		Prime_Number_2 pr=new Prime_Number_2();
		pr.prime(n);
		pr.prime_numberrange(n);
		
	}
}
