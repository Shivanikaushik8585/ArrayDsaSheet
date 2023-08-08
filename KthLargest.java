package sheet;

import java.util.Arrays;

public class KthLargest {
	public static int kthlar(int arr[],int k) {
		Arrays.sort(arr);
		int n = arr.length;
		for(int i=0;i<n;i++) {
			if(i==k) {
				return arr[n-i];
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,8,5,6};
	System.out.print(kthlar(arr,3));
	}

}
