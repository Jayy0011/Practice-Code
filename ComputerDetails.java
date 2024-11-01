class Computer 
{
	void getData()
	{ 
			class Processor
			{
				void displayDetails()
				{
					System.out.println("This is from the Intel brand");
					System.out.println("Its intel core i7th ");
					System.out.println("This has a speed of 2.4 Ghz");
				}
			}	
	Processor p1 = new Processor();
	p1.displayDetails();
	}
}
class ComputerDetails
{
	public static void main (String[] args){
		
		Computer c1 = new Computer();
		c1.getData();
	}
}