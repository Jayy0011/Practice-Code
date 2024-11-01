class TV
{
	public void start()
	{
		System.out.println("Started the TV");
	}
	public void ChangeChannel()
	{
		System.out.println("Channel Changed Successfully");
	}
}	
class SmartTV extends TV
{
	@Override
	public void start()
	{
		System.out.println("Started the SmartTV");
	}
	@Override
	public void ChangeChannel()
	{
		System.out.println("Ch Changed Successfully");
	}
	public void Browser()
	{
		System.out.println("SmartTV is Browsing");
	}
}
 
 public class Overriding_01
{
	public static void main(String[] args) 
	{
		TV t1=new TV();
		t1.start();
		t1.ChangeChannel();
		
		SmartTV t2=new SmartTV();
		t2.start();
		t2.ChangeChannel();
		t2.Browser();
		
		TV t3=new SmartTV();
		t3.start();
		t3.ChangeChannel();
		//t3.Browser(); CE: This doesnot comes under TV references
		
		//SmartTV t4=new TV(); CE: SmartTV cannont converted to TV
	}
}
