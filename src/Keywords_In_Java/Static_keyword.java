package Keywords_In_Java;

public class Static_keyword {

	static int i=5;///// This Class Level Variable are only static variable.
	
	void m1() {
		//static int j=2;//Never use Static Keyword with local variable.This will give error.
		int j=2;
		
	}
	
	public static void main(String args[]) {
		
		//System.out.println(i); //This will give error. We have to use class name to access the variable("Static_keyword.i")
		
		System.out.println(Static_keyword.i); // this is correct format to access the variable
		
	}
}
