package Codes;

public class count_even_odd_digit {

	static public void count_even_odd() {
		
		int n=457943662;
		int sum;
		
		while(n!=0) {
			sum=n%10;
			
			if(sum%2==0) {
				System.out.println("Even number :"+sum);
			}
			else {
				System.out.println("Odd number :"+sum);
			}
			n=n/10;
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count_even_odd();
	}

}
