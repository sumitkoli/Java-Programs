package Codes;

public class Swap_data_Within_Two_Numbers {

	public void swap_data() {
		int a=2;
		int b=5;
		
		a=b-a;
		b=b-a;
		a=a+b;
		
		System.out.println(+a);
		System.out.println(+b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap_data_Within_Two_Numbers swap=new Swap_data_Within_Two_Numbers();
		swap.swap_data();
				
		
	}

}
