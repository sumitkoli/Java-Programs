package Codes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue_Functions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList q=new LinkedList();

		LinkedList a=new LinkedList();
		
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("D");
		q.add("B");
		q.add("F");
		q.offer("G");
		q.add(12); //It will accept  heterogeneous data only

		System.out.println(q);//[A, B, C, D, B, F] Insertion Order Preserve and duplicates are allowed

		//Get the header element
		System.out.println("Getting the header Element with element() method: ");
		System.out.println(q.element());//Returns head element //Returns Exception when Queue is empty

		System.out.println("Getting the header Element with peek method: ");
		System.out.println(q.peek());//Returns head element //Returns Null when Queue is empty

		//Return and Remove the Header Element from the Queue remove() & poll()
		System.out.println("After performing Remove operation : ");
		System.out.println(q.remove());//A //Returns Exception when Queue is empty
		System.out.println(q);//[B, B, C, D, G, F]

		//Poll()
		System.out.println("After performing Poll operation : ");
		System.out.println(q.poll());//B  //Returns Null when Queue is empty
		System.out.println(q);//[B, C, D, G, F]

		//Iterator to read elements
		System.out.println("Elements from Iterator");
		Iterator it=q.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());	
		}

		//For each loop to read elements
		System.out.println("Elements from For each loop");
		for(Object e:q) {
			System.out.println(e);
		}
	}

}
