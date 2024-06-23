class First
{
	int a=24;
	First()
	{
		System.out.println("You are in PARENT Class");
	}
	void show()
	{
		System.out.println("PARENT SHOW INVOKED");
	}
}
class Second extends First
{
	int b;
	Second()
	{
		super();
		System.out.println("You are in CHILD CLASS");
		b=super.a;
	}
	void show()
	{
		super.show();
		System.out.println("CHILD SHOW INVOKED");
		System.out.println("PARENT CLASS VARIABLE VALUE = "+(++b));
	}
}
public class Superkw
{
	public static void main(String args[])
	{
		System.out.println("\n Riya Shah \t 170410107108");
		Second s1=new Second();
		s1.show();
	}
}
