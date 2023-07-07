package Keywords_In_Java;

public class Without_static_Keyword_counter_program {

	int count = 0; // This variable is  for object not for the class.

	public Without_static_Keyword_counter_program() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Without_static_Keyword_counter_program cp1 = new Without_static_Keyword_counter_program();
		Without_static_Keyword_counter_program cp2 = new Without_static_Keyword_counter_program();
		Without_static_Keyword_counter_program cp3 = new Without_static_Keyword_counter_program();

	}
}
