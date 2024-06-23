import Parent.*;

class base extends Parent
{
	private int pri;
	int modi;
	protected int pro;
	public int pub;
	
	base(int a,int b,int c,int d)
	{
		super(a,b,c,d);
		pri=a;
		modi=b;
		pro=c;
		pub=d;
	}
	void show()
	{
		System.out.println("\n In the same class ");
		System.out.println("\n Private : "+pri);
		System.out.println("\n Protected : "+pro);
		System.out.println("\n Default : "+modi);
		System.out.println("\n Public : "+pub);
	}
	void showParent()
	{
		System.out.println("\n In the sub-class with different package ");
		//System.out.println("\n Private : "+prip);
		System.out.println("\n Protected : "+prop);
		//System.out.println("\n Default : "+modip);
		System.out.println("\n Public : "+pubp);
	}
}
class derived extends base
{
	derived(int a,int b,int c,int d)
	{
		super(a,b,c,d);
	}
	void disp()
	{
		System.out.println("\n In the sub-class with same package ");
		//System.out.println("\n Private : "+pri);
		System.out.println("\n Protected : "+pro);
		System.out.println("\n Default : "+modi);
		System.out.println("\n Public : "+pub);
	}
}
public class Myaccess
{
	public static void main(String[] st)
	{
		base b1=new base(10,20,30,40);
		b1.show();

		derived d1=new derived(100,200,300,400);
		d1.disp();
		
		System.out.println("\n In the non-sub-class with same package ");
		//System.out.println("\n Private : "+b1.pri);
		System.out.println("\n Protected : "+b1.pro);
		System.out.println("\n Default : "+b1.modi);
		System.out.println("\n Public : "+b1.pub);
		
		b1.showParent();
		
		System.out.println("\n In the non-sub-class with different package ");
		//System.out.println("\n Private : "+b1.prip);
		//System.out.println("\n Protected : "+b1.prop);
		//System.out.println("\n Default : "+b1.modi);
		System.out.println("\n Public : "+b1.pub);
	}
}	