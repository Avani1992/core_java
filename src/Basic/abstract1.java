package Basic;

public abstract class abstract1 {
	
	void m1()
	{
		System.out.println("Normal Method....");
	}
	abstract void m2();
	abstract void m3();

}

class abstract2 extends abstract1
{
	void m2()
	{
		System.out.println("Abstract Method-1");
	}
	void m3()
	{
		System.out.println("Abstract Method-2");
	}
	public static void main(String[] args) 
	{
		abstract2 a2=new abstract2();
		a2.m1();
		a2.m2();
		a2.m3();
	}
}
