package Codes;

public class count_digits_of_number {

	static public void count_digits() {
		int sum;
		int n=231257845;
		int count = 0;
		
		while(n!=0) {
			count ++;
			sum=n%10;
			
			n=n/10;
			
			
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count_digits();
	}

}
