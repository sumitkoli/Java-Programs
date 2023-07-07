package Keywords_In_Java;

public class Static_method_belongs_to_class {

	//Static Method
	static void m1() {
		System.out.println("Class Object: ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_method_belongs_to_class as=new Static_method_belongs_to_class();
		as.m1();
		m1();//Static method can accessed directly without creating object in same class.
		
		//Non-Static method
		method_belongs_to_object as1=new method_belongs_to_object();
		as1.m2();
	}

}
