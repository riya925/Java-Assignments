class A
{
	void m1()
	{
		System.out.println("class A");
	}
}
class B extends A
{
	void m1()
	{
		System.out.println("class B");
	}
}
class C extends B
{
	void m1()
	{
		System.out.println("class C");
	}
}
public  class Dyna
{
	public static void main(String args[])
	{
		System.out.println("\n Riya Shah \t 170410107108");
		A a=new A();
		A b=new B();
		A c=new C();
		a.m1();
		b.m1();
		c.m1();
	}
}