package Keywords_In_Java;

public class Static_block {

	static {  //Static Block
		System.out.println("Static block"); 
	}
	
	public static void main(String args[]) {
		System.out.println("Hello World");
	}
}

/* 
 Output:
 
Static block
Hello World

First, JVM executes the static block, then it executes static methods, and then it creates the object needed by the program. 
Finally, it executes the instance methods. JVM executes a static block on the highest priority basis. 
It means JVM first goes to static block even before it looks for the main() method in the program.

 */