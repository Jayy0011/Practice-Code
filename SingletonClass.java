class  CoffeeMachine
{
	private float coffeeQty;
	private float waterQty;
	
	static private CoffeeMachine our = null;
	
	private CoffeeMachine()
	{
		coffeeQty = 1;
		waterQty = 1;
	}
	
	public static CoffeeMachine getInstance()
	{
		if (our == null)
		{
			our = new CoffeeMachine();
		}
		return our;
	}
}
public class SingletonClass
{
	public static void main(String[] args){
		CoffeeMachine m1 = CoffeeMachine.getInstance();
		CoffeeMachine m2 = CoffeeMachine.getInstance();
		CoffeeMachine m3 = CoffeeMachine.getInstance();
		
		System.out.println(m1+" "+m2+" "+m3);
		if(m1==m2 && m1==m3)
			System.out.println("Same");
	}
}