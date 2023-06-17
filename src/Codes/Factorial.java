package Codes;

import java.util.Scanner;

public class Factorial {
	
	public void factorial_Num() {
		
		System.out.println("Enter the number to find factorial");
		
		Scanner sc=new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int fact = 1;
		
		for(int i=1;i<=n;i++) {
			
		fact= i*fact;
		}
		System.out.println("Factorial of "+n+" is :"+fact);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial fact=new Factorial();
		fact.factorial_Num();
	}

}
