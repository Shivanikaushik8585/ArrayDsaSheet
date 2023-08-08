package sheet;

public class TrappingRainWater {
	public static int water(int arr[]) {
		int n= arr.length;
		int leftMax[] = new int[n];
		int rigthMax[]= new int[n];
		leftMax[0]= arr[0];
		for(int i=1;i<n;i++) {
			leftMax[i]= Math.max(arr[i], leftMax[i-1]);
		}
		rigthMax[n-1]= arr[n-1];
		for(int i=n-2;i>=0;i--) {
			 rigthMax[i] = Math.max(arr[i], rigthMax[i+1]);
			
		}
		int trapWater = 0;
		for(int i=0;i<n;i++) {
			int level= Math.min(leftMax[i], rigthMax[i]);
			trapWater+= level-arr[i];
		}
		return trapWater;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,2,0,6,3,2,5};
		System.out.print(water(arr));

	}

}
