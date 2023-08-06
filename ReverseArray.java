package sheet;

public class ReverseArray {
	public static void ReverseNum(int arr[]) {
		int start = 0; int last =arr.length-1;
		while(start<last){
			int temp = arr[start];
			arr[start]= arr[last];
			arr[last] = temp;
			start++;
			last--;
			
		}
	}
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,9};
		ReverseNum(arr);
		print(arr);

	}

}
