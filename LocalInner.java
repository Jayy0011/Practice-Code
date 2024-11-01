interface My
{
	public void showMe();
}

class Outer
{
	public void display()
	{
		My m = new My(){public void showMe(){System.out.println("Hello jay");}};
		m.showMe();
		class Inner
		{
			public void show()
			{
				System.out.println("Hello");
			}
		}
		new Inner().show(); 
		Inner i = new Inner();
		i.show();
	}
}
public class LocalInner
{
	public static void main(String[] args){
		
		Outer o = new Outer();
		o.display();
	}
}
