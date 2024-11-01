class myThread extends Thread 
{
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

class Test02
{
	public static void main(String[] args)
	{
		myThread t = new myThread();
		t.start();
		
		int i =1;
		while(true)
		{
			System.out.println(i+"world");
			i++;
		}
	}
}