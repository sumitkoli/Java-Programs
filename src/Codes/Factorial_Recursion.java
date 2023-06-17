package Codes;

public class Factorial_Recursion {

	int fact=1;
	
	public int recursion_fact(int n) {
		if(n>1) {
		fact=fact*n;
		recursion_fact(n-1);// recursion
		}
		return fact;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		Factorial_Recursion factr=new Factorial_Recursion();
		int result = factr.recursion_fact(n);
		System.out.println("Factorial is:"+result);
		
	}

}
