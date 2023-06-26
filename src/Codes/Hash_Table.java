package Codes;

import java.util.Hashtable;

public class Hash_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable m=new Hashtable();

		m.put(101, "David");
		m.put(102, "John");
		m.put(103, "Smith");
		m.put(104, "Mack");
		m.put(105, "Mary");
		//m.put(null, "Mary");// Null Exception
		//m.put(105, null);// Null Exception

		System.out.println(m);//{105=Mary, 104=Mack, 103=Smith, 102=John, 101=David}

		System.out.println(m.get(105));//Mary

		m.remove(105);
		System.out.println(m);//{104=Mack, 103=Smith, 102=John, 101=David}

		System.out.println(m.containsKey(103));//true
		System.out.println(m.containsKey(105));//false

		System.out.println(m.containsValue("John"));//true
		System.out.println(m.containsValue("Dev"));//false

		System.out.println(m.keySet());//[101, 102, 103, 104, 105] //Return Set

		System.out.println("Reading each key at a time :");
		for(Object i:m.keySet()) {
			System.out.println(i);
		}

		System.out.println(m.values()); //[David, John, Smith, Mack, Mary] //Returns Values

		System.out.println("Reading each value at a time :");
		for(Object j:m.values()) {
			System.out.println(j);
		}

		System.out.println("Reading each key and value at a time :");
		for(Object i:m.keySet()) {
			System.out.println(i+"     "+m.get(i));
		}

		System.out.println(m.entrySet());//[101=David, 102=John, 103=Smith, 104=Mack, 105=Mary] // Returns all Entries
	}

}
