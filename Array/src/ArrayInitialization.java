import java.util.Arrays;

public class ArrayInitialization {
	
	public static void main(String[] args) {
		
		int[] arr1= {12,34,56,78,90,87,65};
		for(int x:arr1){
			
			System.out.print(x+" ");
		}
		System.out.println();
		
		
		Object[] arr2=new Object[5];
		arr2[0]=12;
		arr2[1]="Chandan";
		arr2[2]=20.56;
		arr2[3]=5.5f;
		arr2[4]='a';
		
		for(Object x:arr2){
			
			System.out.print(x+" ");
		}
		System.out.println();
		
		String[] arr3=new String[] {"Mahi","Virat"};
		String[] arr4={"Mahi","Virat"};
		System.out.println(Arrays.toString(arr3));
		
		int[] arr5=new int[] {2,4,7,8,90,34,2};
		int[] arr6={2,4,7};
		
		Arrays.sort(arr5);
		System.out.println(Arrays.toString(arr5)); 
		

	}
}
