package Keywords_In_Java;

public class Without_using_Static_keyword {

	int empid;
	String empname;
	String company; //We should use company as Static keyword, because its same and used by all object.

	// Parametric Constructor
	public Without_using_Static_keyword(int empid, String empname, String company) {

		// this keyword refer to current class variable.
		this.empid = empid;
		this.empname = empname;
		this.company = company;
	}

	public void display() {
		System.out.println(empid + " " + empname + " " + company);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Without_using_Static_keyword as1 = new Without_using_Static_keyword(12, "Jack Jones", "DFS");
		as1.display();
		Without_using_Static_keyword as2 = new Without_using_Static_keyword(13, "Mack Jones", "DFS");
		as2.display();

	}

}


