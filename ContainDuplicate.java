package sheet;

import java.util.Arrays;

public class ContainDuplicate {
	public static int duplicate(int arr[]) {
		Arrays.sort(arr);
		int n =arr.length;
		
		for(int i=0;i<n;i++) {
		 if(arr[i]==arr[i+1]) {
			 return arr[i];
		 }
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,8,3,9,4,3};
		System.out.print(duplicate(arr));

	}

}
