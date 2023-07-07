package Collection_Framework_Java;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Function2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList al=new LinkedList() ;
			
		al.add("A");
		al.add("X");
		al.add("M");
		al.add("O");
		al.add("D");
		al.add("S");
		al.add("K");
		
		//Add all method
		System.out.println("Add All Method : ");
		LinkedList bl= new LinkedList();
		bl.addAll(al);
		System.out.println(bl);
		
		//Remove All
		System.out.println("Remove All Elements : ");
		bl.removeAll(al);
		System.out.println(bl);
		
		//Sorting
		System.out.println("Sorting Elements : ");
		Collections.sort(al);
		System.out.println(al);
		
		//Reverse
		System.out.println("Reversing Elements : ");
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		//Shuffling
		System.out.println("shuffling Elements : ");
		Collections.shuffle(al);
		System.out.println(al);
	}

}
