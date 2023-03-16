package Test;

public class Basics {

	public static void main(String[] args) {

//		byte--->short--->int--->long--->float--->double
//						  |
//						  |
//						 char
		
		byte b =10;
		int i=12;
		double d=23.6;
		double res=(b+i+d);
		
		char c='a';
		int i1=97;
		char c1 =(char)(c-32);
		
		System.out.println(c1);
		
		System.out.println(c+i1+d);
		
//		for(int j=0;j<256;j++)
//		{
//			char cc =(char)j;
//			System.out.println(cc);
//		}
		
		byte bt=(byte)234567899;
		System.out.println(bt);
		
		
		
	}

}














