class Student
{
	int id;
	String na,clg;
	Student(int id,String na)
	{
		this.na=na;
		this.id=id;
	}
	Student(int id,String na,String c)
	{
		this(id,na);
		clg=c;
	}
	void disp()
	{
		System.out.println("\n****COMPUTER TY-2****");
	}
	void show()
	{
		this.disp();
		System.out.println("STUDENT ID : "+this.id);
		System.out.println("STUDENT NAME : "+this.na);
		System.out.println("STUDENT COLLAGE : "+clg);
	}
}
public class ThisKw
{
	public static void main(String sp[])
	{
		System.out.println("\n Riya Shah \t 170410107108");
		Student s1=new Student(101,"Liya","SVIT");
		s1.show();
		Student s2=new Student(102,"Riya","MIT");
		s2.show();
	}	
}
