interface vehicleone
{
	int speed=90;
	public void distance();
}
interface vehicletwo
{
	int distance=100;
	public void speed();
}
class Vehicle implements vehicleone,vehicletwo
{
	public void distance()
	{
		int distance=speed*100;
		System.out.println("distance travelled is "+distance);
	}
	public void speed()
	{
		int speed=distance/100;
		System.out.println("speed is "+speed);
	}
}
class As6
{
	public static void main(String args[])
	{
		System.out.println("\n Riya Shah \t 170410107108");
		System.out.println();
		Vehicle obj=new Vehicle();
		System.out.println("Vehicle");
		obj.distance();
		obj.speed();
	}
}