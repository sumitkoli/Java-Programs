package Arrays_Program;

import java.util.Scanner;

import javax.management.modelmbean.DescriptorSupport;

public class Desecending_sort {

	public void sorting() {
		
		int temp=0;
		int n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of array :");
		n=sc.nextInt();
		
		int [] arr=new int[n];
		
		//Getting Elements from the user
		System.out.println("Enter elements for array :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		//The original elements
		System.out.println("The original elements of array are :");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//Descending Sorting
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("The Sorted elements of array are :");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desecending_sort sort=new Desecending_sort();
		sort.sorting();
	}

}
