package String_Programs;

public class Different_Character_SubString {

	public void subString() {

		String content ="asad123(@(@*@(SDASA2213";
		String alphabat ="";
		String number="";
		String special="";
		
		content=content.toLowerCase();
		
		for(int i=0;i<content.length();i++) {
			if(content.charAt(i)>='a'&& content.charAt(i)<='z') {
				
				alphabat=content.charAt(i)+alphabat;
			}
			else if(content.charAt(i)>='0' && content.charAt(i)<='9') {
				
				number=content.charAt(i)+number;
			}
			else {
				special=content.charAt(i)+special;
			}
		}
		System.out.println("Alphabats are: "+alphabat);
		System.out.println("Number's are: "+number);
		System.out.println("Special Character's are: "+special);
	}

	public static void main(String[] args) {

		Different_Character_SubString t1 = new Different_Character_SubString();
		t1.subString();
	}
}
