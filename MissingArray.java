package sheet;

import java.util.Arrays;

public class MissingArray {
public static int missing(int arr[]) {
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++) {
		if(arr[i+1]-arr[i]>1) {
			return arr[i]+1;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {3,5,9,8,4};
		System.out.print(missing(arr));
		

	}

}
