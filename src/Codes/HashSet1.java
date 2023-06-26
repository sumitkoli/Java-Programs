package Codes;

import java.util.*;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs = new HashSet(); // Default Capacity 16 and load factor 0.75

		// HashSet hs=new HashSet(100); // Initial Capacity 100

		// HashSet hs=new HashSet(100,(float)0.95); // Initial Capacity 100 and load
		// factor 0.95

		// HashSet <Integer>hs=new HashSet<Integer>();//homogenous data

		// Add
		hs.add(100);
		hs.add("Welcome");
		hs.add("S");
		hs.add(0.12);
		hs.add("D");
		hs.add(true);
		hs.add(null);

		System.out.println(hs);// [null, 0.12, S, 100, D, Welcome, true] Insertion Order not preserved

		// Remove
		hs.remove("D");
		System.out.println("After removing the object");
		System.out.println(hs);// [null, 0.12, S, 100, Welcome, true]

		// Contains
		System.out.println(hs.contains(0.12));// true
		System.out.println(hs.contains("sd"));// false

		// Is Empty
		System.out.println(hs.isEmpty());// false

		// Reading Object/Elements from Hash set with for each loop
		System.out.println("By Using For each Loop : ");
		for (Object e : hs) {
			System.out.println(e);
		}

		// Reading Object/Elements from Hash set with Iterator
		System.out.println("By Using Iterator : ");

		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
