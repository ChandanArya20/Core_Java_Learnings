abstract class Plane
{
	abstract public void takeOff();
	abstract public void fly();
	abstract public void landing();
	public void airport() {
		
		System.out.println("All plane needs airport");
	}
}
class CargoPlane extends Plane
{
	public void takeOff() {
		
		System.out.println("Cargo plane needs longer runway to take off");
	}
	public void fly() {
		
		System.out.println("Cargo Plane is at lower hieght");
	}
	public void landing() {
		
		System.out.println("CargoPlane needs longer runway to land");
	}
	public void carryGoods() {
		
		System.out.println("Cargo plane carries goods");
	}
}
class PassengerPlane extends Plane
{
	public void takeOff() {
		
		System.out.println("Passengereplane needs longer runway to take off");
	}
	public void fly() {
		
		System.out.println("Passenger Plane is at medium hieght");
	}
	public void landing() {
		
		System.out.println("PassengerPlane needs longer runway to land");
	}
	
	public void carryPassenger() {
		
		System.out.println("Cargo plane carries passengers");
	}
}

class Airport
{
	public void permit(Plane plane) {
		
		plane.takeOff();
		plane.fly();
		plane.landing();
	}
}
public class Abstraction1 {

	public static void main(String[] args) {
		
		CargoPlane cp =new CargoPlane(); 
		PassengerPlane pp =new PassengerPlane(); 
		
		Airport a =new Airport();
		a.permit(cp);
		a.permit(pp);
		
		
		
	}

}
