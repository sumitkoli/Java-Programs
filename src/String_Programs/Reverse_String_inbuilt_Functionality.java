package String_Programs;

import java.util.Scanner;

public class Reverse_String_inbuilt_Functionality {
	
	
	public void reverse( String original) {
		 
		 StringBuilder sbuilder= new StringBuilder(original);
		 
		 sbuilder.reverse();
		 
		String reverse =sbuilder.toString();
		 
		 System.out.println("Reversed String : "+reverse);
	 }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String :");
		
		String original=sc.nextLine();
		
		Reverse_String_inbuilt_Functionality rev=new Reverse_String_inbuilt_Functionality();
		rev.reverse(original);

}

}
