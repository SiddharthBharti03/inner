class MyThread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("child");
		}
	}
	Thread.yield();
}
class yield
{
	public static void main(String[] args)
	{
		MyThread t=new MyThread();
		t.start();
		for(int i=0;i<=5;i++)
		{
			System.out.println("main");
		}
	}
}