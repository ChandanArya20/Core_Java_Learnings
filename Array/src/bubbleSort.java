
public class bubbleSort {
	public static void main(String[] args) {
		int[] arr = {23,45,11,10,76,89,34,21};
		
		for(int i=0;i<arr.length;i++) {
			int flag=0;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
				break;
		}
		
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

}
