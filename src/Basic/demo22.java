package Basic;

public interface demo22 
{
void m1();
void m2();
}
class child22 implements demo22
{
	public void m1()
	{
		System.out.println("Method-1");
	}
	public void m2() 
	{
		System.out.println("Method-2");
	}
	public static void main(String[] args) 
	{
		child22 c1=new child22();
		c1.m1();
		c1.m2();
	}
}
