package Codes;

import java.util.LinkedList;

public class LinkedList_Function3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// LinkedList Specific Function

		LinkedList al = new LinkedList();

		al.add(2);
		al.add(4);
		al.add(5);
		al.add(3);
		al.add(8);
		al.add(9);
		al.add(9);
		al.add(7);

		// Add First Method
		System.out.println("Add First Method : ");
		al.addFirst(1);
		System.out.println(al);// [1, 2, 4, 5, 3, 8, 9, 9, 7]

		// Add Last Method
		System.out.println("Add Last Method : ");
		al.addLast(10);
		System.out.println(al);// [1, 2, 4, 5, 3, 8, 9, 9, 7, 10]

		// Remove First
		System.out.println("Remove First Method : ");
		al.removeFirst();
		System.out.println(al);// [2, 4, 5, 3, 8, 9, 9, 7, 10]

		// Remove Last
		System.out.println("Remove Last Method : ");
		al.removeLast();
		System.out.println(al);// [2, 4, 5, 3, 8, 9, 9, 7]

		// Remove Last Occurrence
		al.removeLastOccurrence(9);
		System.out.println(al);//[2, 4, 5, 3, 8, 9, 7]

		// Get First
		System.out.println("Get First Method : ");
		System.out.println(al.getFirst());//2

		// Get First
		System.out.println("Get Last Method : ");
		System.out.println(al.getLast());//7
	}

}
