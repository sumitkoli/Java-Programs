package Collection_Framework_Java;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Function2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ArrayList al=new ArrayList();
			
			al.add('A');
			al.add('X');
			al.add('C');
			al.add('M');
			al.add('D');
			al.add('F');
			al.add('V');
			
			System.out.println(al);
			
			//Sorting in Array list
			System.out.println("After Sorting Array: ");
			Collections.sort(al);
			System.out.println(al);
			
			//Reverse order
			System.out.println("Reverse Order: ");
			Collections.sort(al,Collections.reverseOrder());
			System.out.println(al);
			
			//Shuffling the elements in ArrayLst
			System.out.println("Element Order After Shuffling : ");
			Collections.shuffle(al);
			System.out.println(al);
		
	}

}
