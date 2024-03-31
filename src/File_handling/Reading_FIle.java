package File_handling;

import java.io.File;
import java.util.Scanner;

public class Reading_FIle {
	Scanner sc;

	public void read_a_File() {

		String path = "C:\\Users\\lenovo\\Desktop\\FileHandling\\filereading.txt";

		try {
			File file = new File(path);
			sc = new Scanner(file);

			System.out.println("The File Content is:");

			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void read_File2(String path) {

		try {
		File file1=new File(path);
		sc=new Scanner(file1);
		
		System.out.println("The File COntent is:");
			
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reading_FIle read = new Reading_FIle();
		// ad.read_a_File();
		String path = "C:\\Users\\lenovo\\Desktop\\FileHandling\\filereading.txt";
		read.read_File2(path);
	}

}
