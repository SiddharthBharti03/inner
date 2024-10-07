interface outer
{
	public void m1();
	
		class inner
		{
			public void m2(){}
		}
}
class outers implements outer
{
	public void m1()
	{
		System.out.println("outer inner class");
	}
}
class inners extends outer.inner
{
	public void m2()
	{
		System.out.println("inner class");
	}
}
class innerexp
{
	public static void main(String[] args)
	{
		outers o=new outers();
		o.m1();
		inners i=new inners();
		i.m2();
	}
}
	