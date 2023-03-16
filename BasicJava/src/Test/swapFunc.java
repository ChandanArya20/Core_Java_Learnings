package Test;
import java.util.Scanner;
public class swapFunc {
	static int a=12,b=78;
	
	public static void main(String[] args) {
//		System.out.println("Before "+a+" and "+b);
//		swap();
//		System.out.println("After "+a+" and "+b);
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two number to be swaped: ");
		a=scan.nextInt();
		b=scan.nextInt();
		System.out.println("Before "+a+" and "+b);
		swap();
		System.out.println("After "+a+" and "+b);
		
		
	}
	static void swap() {
		int temp=a;
		a=b;
		b=temp;
	}

}
