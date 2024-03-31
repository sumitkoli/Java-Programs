package String_Programs;

import java.util.Scanner;

public class Count_Varaibles {

	public void varaible_count() {

		int ucount = 0;

		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence :");
		str = sc.nextLine();

		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				ucount++;
			}

		}

		System.out.println("Count of varaibles : " + ucount);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count_Varaibles var=new Count_Varaibles();
		var.varaible_count();
				
	}

}
