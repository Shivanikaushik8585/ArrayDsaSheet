package sheet;

public class SortedRotatedArray {
	public static int sortedarry(int arr[],int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
				
			}
		}
		return-1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,4,9,8,7};
		System.out.print(sortedarry(arr,9));

	}

}
