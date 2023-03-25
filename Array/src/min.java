
public class min {

	public static void main(String[] args) {
		int[] arr= {34,56,7,89,65};
		
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		
		System.out.println("Minimum value of array is "+min);

	}

}