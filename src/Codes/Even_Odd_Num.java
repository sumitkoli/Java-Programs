package Codes;

import java.util.Scanner;

public class Even_Odd_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for(int i=1;i<=num;i++) {
			
		if (i%2== 0) {
			System.out.println(i+": Even Number");
		} else {
			System.out.println(i+": Odd Numbber");
		}
		}
		
	}

}
