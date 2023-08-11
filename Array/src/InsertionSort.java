
public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr= {2,4,8,12,5,1,2,3,4,5,2,9,23,22};
		
		int i,j;
		for(i=1;i<arr.length;i++) {
			
			int key=arr[i];
			j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
			}
			arr[j+1]=key;
		}
		
		for(int x:arr) {
			System.out.print(x+" ");
		}

	}

}
