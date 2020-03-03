package Basic;

public abstract class car 
{
	
	abstract void carname();
	abstract void carmodel();
	abstract void carcolor();

}

abstract class car1 extends car
{
	void carname()
	{
		System.out.println("CarName=Wagonr");
	}
	void carmodel()
	{
		System.out.println("CarModel=2012");
	}
	abstract void carcolor();
	
}
class car2 extends car1
{
	void carcolor()
	{
		System.out.println("CarColor=White");
	}
	public static void main(String[] args) 
	{
		car2 c2=new car2();
		c2.carname();
		c2.carmodel();
		c2.carcolor();
	}
}
