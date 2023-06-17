package Codes;

import java.util.Scanner;

public class Prime_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter The number\n");
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int j=1;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println(num+": Not a prime number");
				break;
			}
			else {
				j++;
			}
		}
			
			if(j==num-1) {
				System.out.println(num+": Its a Prime Number");
			}
		
	}

}
