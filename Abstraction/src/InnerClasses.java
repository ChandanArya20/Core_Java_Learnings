class Test
{
	private int a=12;
	public void show()
	{
		System.out.println("The value os a is "+a);
	}
	static class Demo1
	{
		private int x=100;
		void show()
		{
//			System.out.println("The value of a is "+a)   //eww cam't use because of static
			System.out.println("The value of x is "+x);
		}
	}
	class Demo2
	{
		private int y=200;
		void show()
		{
			System.out.println("The value of a is "+a);
			System.out.println("The value of y is "+y);
		}
	}
}
public class InnerClasses {

	public static void main(String[] args) {
		
		Test ts=new Test();
		ts.show();
		
		Test.Demo1 dm1;
		dm1=new Test.Demo1();
		dm1.show();
		
		System.out.println();
		Test.Demo2 dm2=ts.new Demo2(); 
		dm2.show();
		
		
	}

}
