
public class max {

	public static void main(String[] args) {
		int[] arr= {34,56,7,89,65};
		
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		
		System.out.println("Maximum value of array is "+max);

	}

}
