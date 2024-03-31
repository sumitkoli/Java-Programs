package String_Programs;

public class DuplicateCharacters {

	
	public void duplicate_character() {
		
		String str1="Two loops will be used to find the duplicate characters. Outer loop will be used to select a character and initialize variable count by..";
		int count ;
		
		char str2[] =str1.toCharArray();
		
		System.out.println("Duplicates character in the string are :");
		
		for(int i=0;i<str1.length();i++) {
			count=1;
			for(int j=i+1;j<str1.length();j++) {
				
				if(str2[i]==str2[j] && str2[i]!=' ') {
					count++;
					
					 //Set string[j] to 0 to avoid printing visited character  
					str2[j]='0';
					
				}
			}
			 //A character is considered as duplicate if count is greater than 1  
			if(count>1 && str2[i]!='0') {
				
				System.out.println(str2[i]+""+count);
			}
		}
				
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateCharacters dup=new DuplicateCharacters();
		dup.duplicate_character();
	}

}
