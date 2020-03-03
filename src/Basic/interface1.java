package Basic;

public interface interface1 
{
	void m1();
	void m2();
	void m3();

}
interface interface2
{
	void m4();
}
interface interface3 extends interface2 // interface-interface extends
{
	void m5();
}
abstract class Child12 implements interface1,interface2 // multiple inheritance,class-interface implements
{
	public void m1()
	{
		System.out.println("Method-1");
	}
}
class Child21 extends Child12 implements interface3
{

	 public void m5()  // public compulsory...
	{
		System.out.println("Method-5");
	}
	public void m2() 
	{
		System.out.println("Method-2");
		
	}

	
	public void m3() 
	{
		System.out.println("Method-3");
		
	}
	public void m4()
	{
		System.out.println("Method-4");
	}
	public static void main(String[] args)
	{
	Child21 c1=new Child21();
	c1.m1();
	c1.m2();
	c1.m3();
	c1.m4();
	c1.m5();
	
}	
}
