import java.util.Scanner;

public class binarySearch {
	public static void main(String[] args) {
		
		int[] arr= {23,56,89,90,165,174,633};
		
		Scanner scan=new Scanner(System.in);
		
		int low=0;
		int high=arr.length-1;
		System.out.print("Enter key to search : ");
		int key=scan.nextInt();
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key) {
				System.out.println("Data found at index "+mid);
				break;
			}
			else if(key<arr[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		if(low>high) {
			System.out.println("Data not found");
		}
		
	}

}
