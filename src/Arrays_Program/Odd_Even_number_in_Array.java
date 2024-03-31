package Arrays_Program;

import java.util.Scanner;

public class Odd_Even_number_in_Array {

	public void even_odd() {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Size of array :");
		
		int n=sc.nextInt();
		
		int arr[]=new int[n] ;
		
		System.out.println("Enter elements in the array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The Original elements of array are :");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("The odd and Even number as follows : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+"  It is Even Number");
 			}
			else {
				System.out.println(arr[i]+"  It is Odd Number");
			}
		}
	}
	
	public void ad(int arr3[]) {
		
		System.out.println("The Original elements of array are :");
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		
		System.out.println("The odd and Even number as follows : ");
		for(int i=0;i<arr3.length;i++) {
			if(arr3[i]%2==0) {
				System.out.println(arr3[i]+"  It is Even Number");
 			}
			else {
				System.out.println(arr3[i]+"  It is Odd Number");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ae[]=new int[] {1,5,4,7,8,6,7};
		Odd_Even_number_in_Array odd=new Odd_Even_number_in_Array();
		odd.even_odd();
		odd.ad(ae);
		
	}

}
