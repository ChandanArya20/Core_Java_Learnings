class Fan
{
	int cost;
	String brand;
	int noOfWings;
	
	@Override
	public String toString() {
		return "Fan [cost=" + cost + ", brand=" + brand + ", noOfWings=" + noOfWings + "]";
	}
	
}
public class array6 
{
	public static void main(String[] args) {
        	
              Fan[] f= new Fan[3];
              
              f[0]=new Fan();
              f[1]=new Fan();
              f[2]=new Fan();
              
              f[0].brand="Hundai";
              f[0].cost=1000000;
              f[0].noOfWings=4;
              
              f[1].brand="Suzzuki";
              f[1].cost=120000;
              f[1].noOfWings=4;
              
              f[2].brand="Mahindra";
              f[2].cost=200000;
              f[2].noOfWings=3;
              
              System.out.println(f[0]);
              System.out.println(f[1]);
              System.out.println(f[2]);
	}
    
}
