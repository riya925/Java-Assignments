interface one
{
	public void m1();
	public void m2();
}
class test  implements one
{
	public void m1()
	{
		System.out.println("First one");
	}
	public void m2()
	{
		System.out.println("Second one");
	}
	
}
public class Inter
{
	public static void main(String args[])
	{
		System.out.println("\n Riya Shah \t 170410107108");
		test t=new test();
		t.m1();
		t.m2();
	}
}