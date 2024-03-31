package String_Programs;

import java.util.Scanner;

public class Remove_vowels {

	public void re_vowels() {
		
		System.out.println("Enter a string :");
		Scanner sc=new Scanner(System.in);
				
		String str=sc.nextLine();
		
		String output="";
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(!(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' )) {
				
				output=output+c;
			}
		}
		
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove_vowels re= new Remove_vowels();
		re.re_vowels();

	}

}
/*
 * String str ="I am a Programmer"; String vowels ="aeiouAEIOU"; String
 * output="";
 * 
 * for(char c:str.toCharArray()) { if(vowels.indexOf(c)==-1) {
 * System.out.println(c); output=output+c; } } System.out.println(output);
 */