abstract class A
{
	abstract void display();
	void print()
	{
		System.out.println("One");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("Abstract method");
	}
}
public class Abstract_kw
{
	public static void main(String args[])
	{
		System.out.println("\n Riya Shah \t 170410107108");
		B b=new B();
		b.display();
		b.print();
	}
}