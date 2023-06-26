package Codes;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//For Homogeneous Data
		// LinkedList <String> al=new LinkedList<String>();
		// LinkedList <Integer> al1=new LinkedList<Integer>();
		
		//For Heterogeneous data	
		LinkedList al=new LinkedList();
		
		//Adding data
		al.add("Welcome");
		al.add("Java");
		al.add('D');
		al.add(2);
		al.add(true);
		al.add(null);
		
		System.out.println(al);//[Welcome, Java, D, 2, true, null]
		
		System.out.println(al.size());//6
		
		//Removing element with index only is available for LinkedList.
		al.remove(2);
		System.out.println("LinkedList after removing array : ");
		System.out.println(al);//[Welcome, Java, 2, true, null]
		
		//Insert value 
		al.add(5, "PHP");
		System.out.println("LinkedList after inserting array : ");
		System.out.println(al);//[Welcome, Java, 2, true, null, PHP]
		
		//Retrieving value
		System.out.println(al.get(3));//true
		
		//Change the value
		al.set(4, "Selenium");
		System.out.println("LinkedList after Changing array : ");
		System.out.println(al);
		
		//Contains
		System.out.println(al.contains("Java"));//True
		System.out.println(al.contains(5));//False
		
		//To check Empty or not
		System.out.println(al.isEmpty());//False
		
		//Reading elements from LinkedList with For Loop
		System.out.println("By using for loop :");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//Reading elements from LinkedList with For each Loop
		System.out.println("By using for each loop :");
		for(Object e:al) {
			System.out.println(e);
		}
		
		//Reading elements from LinkedList with Iterator
		System.out.println("By using Iterator :");
		Iterator it= al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
