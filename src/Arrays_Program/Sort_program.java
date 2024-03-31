package Arrays_Program;

public class Sort_program {

	public void sort_array() {
		
		int [] arr=new int[] {2,1,5,4,8,1,6};
		int temp=0;
		
		//displaying all element in the array
		System.out.println("The original elements of array are :");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		//Sorting ascending order
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("The Sorted elements of array are :");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort_program sorting=new Sort_program();
		sorting.sort_array();
	}

}
