class Thread02 extends Thread
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
	
	public static void main(String[] args)
	{
		Thread02 t = new Thread02();
		//Starting the thread
		t.start();
		
		int i =1;
		while(true)
		{
			System.out.println(i+"world");
			i++;
		}
	}
}