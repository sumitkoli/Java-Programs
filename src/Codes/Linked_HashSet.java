package Codes;

import java.util.LinkedHashSet;

public class Linked_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Insertion order is maintain
		
		LinkedHashSet <Integer>hs=new LinkedHashSet<Integer>();
		
		hs.add(2);
		hs.add(4);
		hs.add(3);
		hs.add(1);
		hs.add(5);
		
		System.out.println("Element of hs :"+hs);//Element of hs :[2, 4, 3, 1, 5]
	}

}
