import java.util.Arrays;
public class arrayClass {
	public static void main(String[] args) {
		int[] arr1= {23,45,67,89,90,32,43};
		int[] arr2= {23,45,67,89,90,100,208};
		
//		Arrays.fill(arr1,10);
//		Arrays.sort(arr1);
		int a=Arrays.binarySearch(arr2,90);
		System.out.println(a);
		
		for(int x:arr1) {
			System.out.print(x+" ");
		}
	}

}
