package Keywords_In_Java;

public class With_using_Static_keyword {

	int empid;
	String empname;
	static String company="DSF"; //We should use company as Static keyword, because its same and shared by all object.

	// Parametric Constructor
	public With_using_Static_keyword(int empid, String empname) {

		// this keyword refer to current class variable.
		this.empid = empid;
		this.empname = empname;
		
	}

	public void display() {
		System.out.println(empid + " " + empname + " " + company);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		With_using_Static_keyword as1 = new With_using_Static_keyword(12, "Jack Jones");
		as1.display();
		With_using_Static_keyword as2 = new With_using_Static_keyword(13, "Mack Jones");
		as2.display();

	}

}
