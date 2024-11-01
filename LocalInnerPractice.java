//outer class
class  Car
{
	//outer class method
	void startEngine()
	{
		//Local inner class
		class Engine
		{
			//Inner class method
			public void run()
			{
				System.out.println("Engine is running.");
			}
		}
	 Engine e1 = new Engine();
	 e1.run();	
	}
}	
class LocalInnerPractice
{
	public static void main(String[] args){
		
		//Instantiating outer class for using local inner class
		Car c1 = new Car();
		c1.startEngine();
	}	
}