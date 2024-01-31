
import java.util.*;
class KthLarge {

	int findKthLargest(int arr[],int k) {
	
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Array elements");
		for(int i = 0; i<arr.length; i++) {
		
			arr[i] = sc.nextInt();
		}

		KthLarge obj = new KthLarge();
		System.out.println("Enter the rank of element");
		int kth = sc.nextInt();
		if(kth>=0 && kth<size) {
		
			System.out.println("Thank you for entering right data");
		}else {
		
			System.out.println("Please Enter the Valid Data");
			return;
		}

		int ret = obj.findKthLargest(arr,kth);
		System.out.println("Kth Largest Element is :"+ ret);
	}
}
