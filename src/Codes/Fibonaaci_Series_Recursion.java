package Codes;

public class Fibonaaci_Series_Recursion {

	int n1=0,n2=1,n3;
	
	public void fibonaaci_Recursion(int count) {
		
		if(count>0) {
			n3=n2+n1;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			fibonaaci_Recursion(count-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=10;
		
		Fibonaaci_Series_Recursion fib=new Fibonaaci_Series_Recursion();
		
		System.out.print(fib.n1+" "+fib.n2);
		fib.fibonaaci_Recursion(count-2);
	}

}
