class A
{
	A()
	{
		System.out.println("PARENT CLASS INVOKED");
	}
	void show()
	{
		System.out.println("Parent show minvoked");
	}
}
class Final extends A
{
	final int v=11;
	Final()
	{
		System.out.println("CHILD CLASS INVOKED");
	}
	void show()
	{
		System.out.println("CHILD show minvoked");
	}	
	{
		System.out.println("instant initilizerer block");
	}
	public static void main(String args[])
	{
		System.out.println("\n Riya Shah \t 170410107108");
		Final f=new Final();
	}	
}
