package Keywords_In_Java;

public class Static_Method_access_static_Method_only {

	static void m1() {
		System.out.println("Static Method");
	//	m2(); //A "static" method can call only other static methods and cannot call a non-static method.

	}
	
	void m2() {
		System.out.println("Non Static Method");
		m1(); // A "Non static" method can call only other static methods and  non-static method.

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();
	}

}
