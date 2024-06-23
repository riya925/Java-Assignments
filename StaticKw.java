class Student
{
	int id;
	String na;
	static String clg="SVIT";
	Student(int id,String na)
	{
		this.na=na;
		this.id=id;
	}
	static void show()
	{
		//System.out.println("STUDENT ID : "+this.id);
		//System.out.println("STUDENT NAME : "+this.na);
		System.out.println("STUDENT COLLAGE : "+clg);
	}
	static
	{
		System.out.println("\nYOU ARE IN COMPUTER TY-2");
	}
}

public class StaticKw
{
	public static void main(String sp[])
	{
		System.out.println("\n Riya Shah  \t 170410107108");
		Student s1=new Student(101,"Liya");
		s1.show();
		Student s2=new Student(102,"Bhavin");
		s2.show();
	}	
}
