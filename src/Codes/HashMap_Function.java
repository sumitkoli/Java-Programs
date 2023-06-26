package Codes;

import java.util.HashMap;

public class HashMap_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap m=new HashMap();//Heterogeneous Data
		
		//HashMap<Integer,String> m=new HashMap<Integer,String>(); //Homogeneous data for Key and Value
		
		m.put(101, "David");
		m.put(102, "John");
		m.put(103, "Smith");
		m.put(104, "Mack");
		m.put(105, "Mary");
		//m.put(103, "Mith"); //Duplicate Key not allowed, it will update the previous value
		m.put(106, "David");
		System.out.println(m);//{101=David, 102=John, 103=Smith, 104=Mack, 105=Mary, 106=David}
		
		
		System.out.println(m.get(105));//Mary
		
		m.remove(106);//Remove pair from HashMap
		System.out.println(m);//{101=David, 102=John, 103=Smith, 104=Mack, 105=Mary}
		
		System.out.println(m.containsKey(102));//true
		System.out.println(m.containsKey(106));//false
		
		System.out.println(m.containsValue("Mack"));//true
		System.out.println(m.containsValue("Dev"));//false
		
		System.out.println(m.isEmpty());//false
		
		
		
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
		
		
		//Entry Interface its subset of HashMap
		
		
		
		
	}

}
