package Arrays_Program;

public class Duplicate_numbers_Array {
	
	public void duplicate() {
		int count=0;
		int arr[] =new int[] {2,1,4,5,6,1,4,8,5,2,4};
		
		String[] arr1 =new String[] {"A","B","C","A","D"};
				

		
		for(int i=0;i<arr.length;i++) {
			count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(arr[i]+" "+count);
			}
		}
		
		for(int i=0;i<arr1.length;i++) {
			count=1;
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i].endsWith(arr1[j])) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(arr1[i]+" "+count);
			}
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duplicate_numbers_Array dp=new Duplicate_numbers_Array();
		dp.duplicate();
	}

}
