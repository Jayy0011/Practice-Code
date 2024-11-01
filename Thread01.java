class myThread extends Thread 
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

class Thread01
{
	public static void main(String[] args)
	{
		myThread t = new myThread();
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