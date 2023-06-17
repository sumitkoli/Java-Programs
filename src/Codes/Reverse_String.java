package Codes;

public class Reverse_String {

	public void reverseString() {
		
		String name ="Sumit";
		
		String reverse="";
		
		for(int i=0;i<name.length();i++) {
			reverse= name.charAt(i)+reverse;
			
		}
		System.out.println("Reversed String :"+ reverse);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Reverse_String rev=new Reverse_String();
	    rev.reverseString();

	}

}
