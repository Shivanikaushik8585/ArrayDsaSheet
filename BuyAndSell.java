package sheet;

public class BuyAndSell {
public static int buynsell(int arr[]) {
	int bp = Integer.MAX_VALUE;
	int mp=0;
	for(int i=0;i<arr.length;i++) {
		if(bp<arr[i]) {
		int profit = arr[i]-bp;
		mp = Math.max(profit, mp);
	}
	else {
		bp = arr[i];
	}
	}
	return mp;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,11,5,3,6,4};
		System.out.print(buynsell(arr));

	}

}
