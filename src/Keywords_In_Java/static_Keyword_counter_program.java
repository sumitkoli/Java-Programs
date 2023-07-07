package Keywords_In_Java;

public class static_Keyword_counter_program {

	 static int count =0; //This variable is not for object but for the class.
	
	public static_Keyword_counter_program() {
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		static_Keyword_counter_program cp1=new static_Keyword_counter_program();
		static_Keyword_counter_program cp2=new static_Keyword_counter_program();
		static_Keyword_counter_program cp3=new static_Keyword_counter_program();
		
	}

}
