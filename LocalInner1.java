class  Outer1
{
	int x = 10;
	static int y = 20;
	
	static class My
	{
		public void show()
		{
			System.out.println(x+" "+y);
		}
	}
}

public class LocalInner1
{
	public static void main(String[] args)
	{
		Outer o = new Outer();
	}
}
