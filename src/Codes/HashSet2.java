package Codes;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet <Integer>evenhs=new HashSet<Integer>();
		evenhs.add(2);
		evenhs.add(8);
		evenhs.add(6);
		
		System.out.println(evenhs);//[2, 6, 8]
		
		//Add all
		HashSet <Integer> number=new HashSet<Integer>();
		number.addAll(evenhs);
		number.add(11);
		
		System.out.println(number);//[2, 6, 8, 11]
		
		//Remove All
		number.removeAll(evenhs);
		System.out.println(number);//[11]
		
		
	}

}
