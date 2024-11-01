class Car
{
	public void start()
	{
		System.out.println("Car Started");	
	}
	public void accelerate()
	{
		System.out.println("Car is Accelerated");
	}
	public void changeGear()
	{
		System.out.println("Car Gear Changed");
	}
}
class LuxuryCar extends Car
{
	@Override
	public void changeGear()
	{
		System.out.println("Automatic Gear");
	}
	public void openRoof()
	{
		System.out.println("Sun Roof is Opened");
	}
}
public class Overriding_02 
{
	public static void main(String[] args) 
	{
		Car c=new Car();
		c.start();
		c.accelerate();
		c.changeGear();
		
		LuxuryCar lc=new LuxuryCar();
		lc.start();
		lc.accelerate();
		lc.changeGear();
		lc.openRoof();
		
		Car c1=new LuxuryCar();
		c1
	}
}
