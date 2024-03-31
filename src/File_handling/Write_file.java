package File_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write_file {
	
	
	public void write_into_file() {
	
String path ="C:\\\\Users\\\\lenovo\\\\Desktop\\\\FileHandling\\\\filereading.txt";
		
		try {
			FileWriter fr=new FileWriter(path);
			try {
			fr.write("This is the first program to write");
			fr.write("This is the Second program to write");
			}
			finally {
				fr.close();
			}
			System.out.println("Successfully data wrote in the file");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	public static void main(String[] args) {
		
		Write_file write=new Write_file();
		write.write_into_file();

}
}
