package Keywords_In_Java;

public class Static_Method_access_static_data_only {

	String b="test1";
	static String a= "Test";
	
	static void m1() {
		System.out.println(a); 
		//System.out.println(b);  // this is invalid, Static Method cannot access static data
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();
	}

}
