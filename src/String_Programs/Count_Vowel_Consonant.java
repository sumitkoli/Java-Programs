package String_Programs;

import java.util.Scanner;

public class Count_Vowel_Consonant {

	
	public void count_vowel() {

		int ucount = 0;
		int vcount = 0;
		
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence :");
		str = sc.nextLine();
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u') {
				ucount++;
			}
			else if(str.charAt(i)>='a'&& str.charAt(i)<='z'){
				vcount++;
			}
		}
		
		System.out.println("Count of vowels : "+ucount);
		
		System.out.println("Count of consonent : "+vcount);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Count_Vowel_Consonant vowel=new Count_Vowel_Consonant();
		vowel.count_vowel();

	}

}
