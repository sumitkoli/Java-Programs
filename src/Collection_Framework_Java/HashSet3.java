package Collection_Framework_Java;

import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Union, Intersection  and difference
		
		HashSet <Integer>hs=new HashSet<Integer>();
		
		hs.add(2);
		hs.add(4);
		hs.add(3);
		hs.add(1);
		hs.add(5);
		
		System.out.println("Element of hs :"+hs);
		
		HashSet <Integer>ha=new HashSet<Integer>();
		ha.add(4);
		ha.add(3);
		ha.add(5);
		ha.add(6);
		
		System.out.println("Element of ha :"+ha);
		
		//Union Unique elements
		//hs.addAll(ha);
		//System.out.println("Unique Elements are : "+hs);
		
		//Intersection
		//hs.retainAll(ha);
		//System.out.println("Intersection Elements are : "+hs);
		
		//Difference
		//hs.removeAll(ha);
		//System.out.println("Difference Elements are : "+hs);
		
		//Subset
		System.out.println(hs.containsAll(ha));
	}

}
