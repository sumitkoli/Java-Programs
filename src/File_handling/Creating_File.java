package File_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Creating_File {

	
	public void create_File() {
		try {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the File name with location");
			String fileName=sc.nextLine();
			
			FileOutputStream fos=new FileOutputStream(fileName, true);
			
			System.out.println("Enter the content in the file");
			String content=sc.nextLine();
			byte b[]=content.getBytes();
			
			fos.write(b);
			fos.close();
			System.out.println("File is saved at given location");
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		Creating_File create=new Creating_File();
		create.create_File();

	}

}
