package Codes;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();

		// adding the elements into the array
		al.add("Welcome");
		al.add('A');
		al.add(1);
		al.add(true);

		System.out.println(al);

		// remove
		// al.remove(1);//here 1 is index
		al.remove("Welcome");// here welcome is element

		System.out.println(al);

		// inserting an element
		al.add(2, "Python");

		System.out.println("Elements after Insertion are : " + al);

		// Retrieving the Elements
		System.out.println(al.get(3));

		// Change the Element
		al.set(2, "Selenium");
		System.out.println("Elements after Replacing are : " + al);

		// Search Elements . It returns true or false value
		System.out.println(al.contains("Selenium"));// True
		System.out.println(al.contains("Selendum"));// False

		// Is Empty. It returns true or false value
		System.out.println(al.isEmpty());// false

		// 1)For Loop
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		// 2) For Each Loop
		System.out.println("Readign element for..each Loop");

		for (Object e : al) {
			System.out.println(e);
		}

		// 3) By using Iterator
		System.out.println("Readign element by using iterator");

		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Add all
		System.out.println("Add all feature");
		ArrayList bl= new ArrayList();
		bl.addAll(al);
		System.out.println(bl);
		
		//Remove All
		System.out.println("Remove all feature");
		
		bl.removeAll(al);
		System.out.println(bl);
		
		//Converting Array to array list
		
	}

}
