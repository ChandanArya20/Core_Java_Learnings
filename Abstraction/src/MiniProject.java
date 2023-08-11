import java.util.Scanner;
abstract class Shapes
{
	float area;
	abstract public void input();
	abstract public void compute();
	public void disp() {
		
		System.out.println("Area is "+ area);
	}
}
class Rectangle extends Shapes
{
	float length;
	float breadth;
	
	public void input() {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Ente rentangle's lenght: ");
		length=scan.nextFloat();
		System.out.println("Enter rectangle's breadth: ");
		breadth=scan.nextFloat();
		scan.close();
		
	}
	public void compute() {
		
		area=length*breadth;
	}
}
class Squre extends Shapes
{
	float side;
	
	public void input() {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Ente length of squre's side: ");
		side=scan.nextFloat();
	}
	public void compute() {
		
		area=side*side;
	}
}
class Circle extends Shapes
{
	float radius;
	final float pi=3.14f;
	
	public void input() {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Ente length of circle's radius: ");
		radius=scan.nextFloat();
	}
	public void compute() {
		
		area=pi*radius*radius;
	}
}
class Geometry
{
	public void permit(Shapes sh) {
		
		sh.input();
		sh.compute();
		sh.disp();
	}
}
public class MiniProject {

	public static void main(String[] args) {
		
		Rectangle r=new Rectangle();
		Squre s=new Squre();
		Circle c=new Circle();
		
		Geometry g=new Geometry();
		g.permit(r);
		g.permit(s);
		g.permit(c);
		

	}

}
