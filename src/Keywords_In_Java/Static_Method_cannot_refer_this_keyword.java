package Keywords_In_Java;

public class Static_Method_cannot_refer_this_keyword {

	int i=3;
	static void m1() {
		//System.out.println(this.i); //cannot_refer_this_keyword
		//System.out.println(super.b); //cannot_refer_super_Keyword
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();
	}

}
