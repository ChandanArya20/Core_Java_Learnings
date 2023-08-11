abstract class Computer
{
	abstract public void switchOff();
		
}
class A
{
	public void config() {
		System.out.println("I am from Class A");
	}
}
abstract class B
{
	abstract public void show();
}
public class AnonymosInnerClass extends B{

	public void show() {
		System.out.println("showing here");
	}
	public static void main(String[] args) {

		A a=new A() 				//Anonymous InnerClass
		{
			public void config() {
				int a=123;
				System.out.println("The value of a is "+a);
				System.out.println("I am here in main method");
			}
		};
		
		a.config();
		
		
		Computer cmp=new Computer()
		{
			public void switchOff() {
				System.out.println("computer is switching off");
			}
		};
		cmp.switchOff();
		
		AnonymosInnerClass aIc=new AnonymosInnerClass();
		aIc.show();
		
	}

}
