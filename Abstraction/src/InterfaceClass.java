interface Isample
{
	//100% abstract
	//by default the methods are public and abstract
	void m1();
	void m2();
}
//class SampleImpl implements Isample
//{
//	public void m1() {
//		System.out.println("method m1");
//	}
//	public void m2() {
//		System.out.println("method m2");
//	}
//}

abstract class SampleImpl implements Isample
{
	public void m1() {
		System.out.println("method m1");
	}	
}
class SubSampleImpl extends SampleImpl
{
	public void m2() {
		System.out.println("method m2");
	}
}
public class InterfaceClass {

	public static void main(String[] args) {

		Isample sample=new SubSampleImpl();
		sample.m1();
		sample.m2();

	}

}
