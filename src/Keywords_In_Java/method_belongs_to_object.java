package Keywords_In_Java;

public class method_belongs_to_object {

	void m2() {
		System.out.println("Method belongs to Object :");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method_belongs_to_object as1=new method_belongs_to_object();
		as1.m2();
		
		Static_method_belongs_to_class.m1(); //A "static" method can be accessed directly by class name and does'nt need any object
	}

}
