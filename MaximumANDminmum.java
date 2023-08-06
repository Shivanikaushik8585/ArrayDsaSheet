package sheet;

public class MaximumANDminmum {
	public static void max_min(int arr[]) {
		int max = Integer.MIN_VALUE;
		int min= Integer.MAX_VALUE;
		
		for(int i =0;i<arr.length;i++) {
		max = Math.max(max, arr[i]);
		min = Math.min(min, arr[i]);
		
			
			
		}
		System.out.println("max:"+max);
		System.out.println("min:"+min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,2,7,1,9};
		max_min(arr);

	}

}
