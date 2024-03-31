package File_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class filehandle1 {
	File file;
	FileOutputStream fos;
	FileInputStream fis;
	
	public void filecreate() {
		
		//Representing File
		file=new File("sample2.txt");
		
		if(!(file.exists())) {
			
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void write_into_file() {
		
		try {
			fos=new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String writtenintofile = "Sumit koli";
		
		try {
			fos.write(writtenintofile.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fos.flush();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void reading_from_File()  {
		
		try {
			fis=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int i = 0;
		String ss="";
		try {
			i = fis.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(!(i==-1)) {
			
			char c =(char)i;
			
			ss= ss+c;
			//System.out.print(c);
			
			try {
				i=fis.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(ss);
		
		
	}
	
	public static void main(String[] args) {
		
		filehandle1 file1=new filehandle1();
		
		file1.filecreate();
		file1.write_into_file();
			file1.reading_from_File();
		
		

	}

}
