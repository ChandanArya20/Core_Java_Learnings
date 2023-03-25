import java.util.Scanner;
public class arrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.print("Enter any five numbers: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
