import java.util.Scanner;
public class lenearSearch {

	public static void main(String[] args) {
		int[] arr= {23,56,89,90,65,44,33};
		Scanner scan=new Scanner(System.in);
		
		int flag=0;
		System.out.print("Enter key to search : ");
		int key=scan.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("Data found at index "+i);
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Data not found");
		
	}

}
