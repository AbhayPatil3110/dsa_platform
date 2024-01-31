//user Defined Exception madhe throw kely var return nahi chalat.
import java.util.*;

class NotValidData extends RuntimeException {

	NotValidData(String str){
	
		super(str);
	}
}

class kthSmallestDemo {

	int findKthSmallest(int arr[],int k) {
	
		Arrays.sort(arr);
		return arr[k-1];
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Array Elements");
		for(int i = 0; i<arr.length; i++) {
		
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the Rank");
		int kth = sc.nextInt();
		if(kth>=0 && kth<arr.length) {
		
			System.out.println("Valid data");
		}else {
		
			throw new NotValidData("Data Valid Nahi, Valid Data Taka!");
			//return;
		}	
		kthSmallestDemo obj = new kthSmallestDemo();
		int ret = obj.findKthSmallest(arr,kth);
		System.out.println("Kth Smallest Element: "+ret);
	}
}
