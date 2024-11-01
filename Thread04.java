class Thread05 implements Runnable
{
	//override from class Thread
	public void run()
	{
		int i=1;
		while(true)
		{
			System.out.println(i+"Hello");
			i++;
		}
	}
}
class Thread04
{	
	public static void main(String[] args)
	{
		Thread05 t = new Thread05();
		Thread t1 = new Thread(t);
		//Starting the thread
		t1.start();
		
		int i =1;
		while(true)
		{
			System.out.println(i+"world");
			i++;
		}
	}
}