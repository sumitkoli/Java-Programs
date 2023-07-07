package Keywords_In_Java;

public class Static_method_overloaded_but_not_overridden {

	static void m1(int i,int j) {
		
		System.out.println(i+" "+j);
	}
	
	static void m1(int i,String j) {
		
		System.out.println(i+" "+j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1(2, 3);
		m1(3, "test");
	}
}
