package Codes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class test1 {

	public void reverse() {

		String str ="ssdd@@0";
		String rev ="";
		int inc = 0;
		
		for(int  i=0;i<str.length();i++) {
			
			rev =str.charAt(i)+rev;
		}
		
		System.out.println(rev);
		
		
	}

	public static void main(String[] args) {

		test1 t1 = new test1();
		t1.reverse();
	}
}
