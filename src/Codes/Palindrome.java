package Codes;

import java.util.Scanner;

public class Palindrome {
	
	public void string_palindrome() {
		 String str, rev = "";
	     Scanner sc = new Scanner(System.in);

	     System.out.println("Enter a string:");
	     str = sc.nextLine();
	     
	     for(int i=0;i<str.length();i++) {
	    	 rev=str.charAt(i)+rev;
	     }
	     System.out.println("Reverse String is:"+rev);
	     
	     if(str.equals(rev)) {
	    	 System.out.println("String is Palindrome:"+str);
	     }
	     else
	    	 System.out.println("String is not a Palindrome:"+str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Palindrome pdrome=new Palindrome();
		pdrome.string_palindrome();
	}

}
