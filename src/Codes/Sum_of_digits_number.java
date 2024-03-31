package Codes;

public class Sum_of_digits_number {

	static int sumodDigit(int n) {
		int sum = 0;
		 
        while (n != 0) {
            sum = sum + n % 10;
            System.out.println(sum+ "kk");
            System.out.println(n+"a");
            n = n / 10;
            System.out.println(n+"l");
        }
 
        return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=887;
		
		System.out.println(sumodDigit(n));
	}

}
