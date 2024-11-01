class Super 
{
	public void display()
	{
		System.out.println("Super CLass DIsplay ");
	}
}
class Sub extends Super
{
	@Override
	public void display()
	{
		System.out.println("Sub Class Display");
	}
}

public class Overriding
{
	public static void main(String[] args)
	{
		Super su = new Super();
		su.display();
		
		Sub sb = new Sub();
		sb.display();
		
		Super s1= new Sub();
		s1.display();	
	}
}
